import React from 'react';
import { Component } from 'react';

class Settings extends Component {
    constructor(props) {
        super(props);

        this.state = {
            id: '',
            firstName: 'James',
            lastName: '',
            email: '',
            completedCourses: [115, 121, 123, 311, 321],
            currentCourses: [295, 255, 471],
            graduationPlan: 'Part-Time',
            enrollmentStatus: 'Good Standing'
        };
    }

    render() {
        return (
            <div>Settings</div>
        );
    }
}

export default Settings;