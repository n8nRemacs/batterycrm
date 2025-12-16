package com.huawei.hms.support.api.push;

import android.content.BroadcastReceiver;

/* loaded from: classes7.dex */
public class PushMsgReceiver extends BroadcastReceiver {
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r9, android.content.Intent r10) throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
        /*
            r8 = this;
            if (r10 == 0) goto Lea
            if (r9 != 0) goto L6
            goto Lea
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "push receive broadcast message, Intent:"
            r0.<init>(r1)
            java.lang.String r1 = r10.getAction()
            r0.append(r1)
            java.lang.String r1 = " pkgName:"
            r0.append(r1)
            java.lang.String r1 = r9.getPackageName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "PushMsgReceiver"
            com.huawei.hms.support.log.HMSLog.i(r1, r0)
            java.lang.String r0 = "TestIntent"
            r10.getStringExtra(r0)     // Catch: java.lang.Exception -> Le5
            java.lang.String r0 = r10.getAction()
            android.content.Context r2 = com.huawei.hms.utils.ResourceLoaderUtil.getmContext()
            if (r2 != 0) goto L3f
            android.content.Context r2 = r9.getApplicationContext()
            com.huawei.hms.utils.ResourceLoaderUtil.setmContext(r2)
        L3f:
            java.lang.String r2 = "com.huawei.intent.action.PUSH_DELAY_NOTIFY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5d
            java.lang.String r2 = "com.huawei.intent.action.PUSH"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L56
            int r0 = com.huawei.hms.android.HwBuildEx.VERSION.EMUI_SDK_INT
            r2 = 10
            if (r0 >= r2) goto L56
            goto L5d
        L56:
            java.lang.String r9 = "message can't be recognised."
            com.huawei.hms.support.log.HMSLog.i(r1, r9)
            goto Le4
        L5d:
            java.lang.String r0 = "selfshow_info"
            boolean r0 = r10.hasExtra(r0)
            if (r0 == 0) goto Le4
            o01.b r0 = new o01.b
            java.lang.String r2 = "push_notify_flag"
            r0.<init>(r9, r2)
            java.lang.String r2 = "notify_msg_enable"
            boolean r0 = r0.b(r2)
            if (r0 == 0) goto L75
            goto Lc9
        L75:
            java.lang.String r0 = "appops"
            java.lang.Object r0 = r9.getSystemService(r0)
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0
            android.content.pm.ApplicationInfo r2 = r9.getApplicationInfo()
            android.content.Context r3 = r9.getApplicationContext()
            java.lang.String r3 = r3.getPackageName()
            int r2 = r2.uid
            java.lang.Class<android.app.AppOpsManager> r4 = android.app.AppOpsManager.class
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> Le1
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r5 = "checkOpNoThrow"
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            java.lang.Class[] r6 = new java.lang.Class[]{r6, r6, r7}     // Catch: java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1
            java.lang.reflect.Method r5 = r4.getMethod(r5, r6)     // Catch: java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1
            java.lang.String r6 = "OP_POST_NOTIFICATION"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r6)     // Catch: java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            java.lang.Object r4 = r4.get(r6)     // Catch: java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1
            r4.intValue()     // Catch: java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2, r3}     // Catch: java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1
            java.lang.Object r0 = r5.invoke(r0, r2)     // Catch: java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1 java.lang.Throwable -> Le1
            if (r0 != 0) goto Lc9
            goto Le1
        Lc9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r9.getPackageName()
            r0.append(r2)
            java.lang.String r2 = " disable display notification."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.huawei.hms.support.log.HMSLog.i(r1, r0)
        Le1:
            z01.h.a(r9, r10)
        Le4:
            return
        Le5:
            java.lang.String r9 = "intent has some error"
            com.huawei.hms.support.log.HMSLog.e(r1, r9)
        Lea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.support.api.push.PushMsgReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
