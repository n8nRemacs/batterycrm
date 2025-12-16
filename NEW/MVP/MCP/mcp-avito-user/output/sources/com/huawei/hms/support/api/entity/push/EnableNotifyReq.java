package com.huawei.hms.support.api.entity.push;

import androidx.appcompat.app.r;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* loaded from: classes7.dex */
public class EnableNotifyReq implements IMessageEntity {

    @Packed
    public boolean enable;

    @Packed
    public String packageName;

    public String getPackageName() {
        return this.packageName;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z12) {
        this.enable = z12;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EnableNotifyReq{packageName='");
        sb2.append(this.packageName);
        sb2.append("', enable=");
        return r.x(sb2, this.enable, '}');
    }
}
