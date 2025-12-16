package ru.ok.android.onelog;

import android.net.Uri;
import defpackage.gy7;
import defpackage.jt0;
import defpackage.nm;
import defpackage.om;
import defpackage.ox7;
import defpackage.rx7;
import defpackage.tha;
import defpackage.ul;
import defpackage.wm;
import defpackage.yl;
import java.io.IOException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

/* loaded from: classes2.dex */
final class OneLogApiRequest implements yl {
    private static final Uri URI = wm.a("log.externalLog");
    private final String application;
    private final String collector;
    private final jt0 items;
    private final String platform;

    public OneLogApiRequest(String str, String str2, String str3, jt0 jt0Var) {
        this.collector = str;
        this.application = str2;
        this.platform = str3;
        this.items = jt0Var;
    }

    public boolean canRepeat() {
        return this.items.canRepeat();
    }

    @Override // defpackage.yl
    public /* bridge */ /* synthetic */ ul getConfigExtractor() {
        return ul.f;
    }

    @Override // defpackage.yl
    public /* bridge */ /* synthetic */ ox7 getFailParser() {
        return tha.c;
    }

    @Override // defpackage.yl
    public ox7 getOkParser() {
        return rx7.a;
    }

    @Override // defpackage.hm
    public int getPriority() {
        return 2;
    }

    @Override // defpackage.hm
    public nm getScope() {
        return nm.c;
    }

    @Override // defpackage.yl
    public /* bridge */ /* synthetic */ om getScopeAfter() {
        return om.a;
    }

    @Override // defpackage.hm
    public Uri getUri() {
        return URI;
    }

    @Override // defpackage.hm
    public boolean shouldGzip() {
        return true;
    }

    @Override // defpackage.hm
    public boolean shouldPost() {
        return true;
    }

    public boolean shouldReport() {
        return false;
    }

    @Override // defpackage.hm
    public /* bridge */ /* synthetic */ boolean willWriteParams() {
        return true;
    }

    @Override // defpackage.hm
    public /* bridge */ /* synthetic */ boolean willWriteSupplyParams() {
        return false;
    }

    @Override // defpackage.hm
    public void writeParams(gy7 gy7Var) throws JsonSerializeException, IOException {
        gy7Var.b0(CallAnalyticsApiRequest.KEY_COLLECTOR);
        gy7Var.h(this.collector);
        gy7Var.b0("data");
        gy7Var.p();
        gy7Var.b0(CallAnalyticsApiRequest.KEY_APPLICATION);
        gy7Var.h(this.application);
        gy7Var.b0(CallAnalyticsApiRequest.KEY_PLATFORM);
        gy7Var.h(this.platform);
        gy7Var.b0(CallAnalyticsApiRequest.KEY_ITEMS);
        this.items.write(gy7Var);
        gy7Var.n();
    }

    @Override // defpackage.hm
    public /* bridge */ /* synthetic */ void writeSupplyParams(gy7 gy7Var) throws JsonSerializeException, IOException {
    }
}
