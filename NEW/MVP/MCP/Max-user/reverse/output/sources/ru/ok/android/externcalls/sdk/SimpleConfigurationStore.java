package ru.ok.android.externcalls.sdk;

import defpackage.vo3;
import defpackage.wo3;

/* loaded from: classes2.dex */
public class SimpleConfigurationStore implements wo3 {
    private final String appKey;
    private final String baseEndpoint;
    private vo3 sessionInfo;

    public SimpleConfigurationStore(wo3 wo3Var) {
        this.appKey = wo3Var.getAppKey();
        this.baseEndpoint = wo3Var.getBaseEndpoint();
    }

    @Override // defpackage.wo3
    public String getAppKey() {
        return this.appKey;
    }

    @Override // defpackage.wo3
    public String getBaseEndpoint() {
        return this.baseEndpoint;
    }

    @Override // defpackage.wo3
    public vo3 getSessionInfo() {
        return this.sessionInfo;
    }

    @Override // defpackage.wo3
    public void setSessionInfo(vo3 vo3Var) {
        this.sessionInfo = vo3Var;
    }
}
