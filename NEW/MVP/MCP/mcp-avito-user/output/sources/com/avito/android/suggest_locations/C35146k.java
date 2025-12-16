package com.avito.android.suggest_locations;

import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.suggest_locations.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C35146k implements l41.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f292336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C35154t f292337c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f292338d;

    public /* synthetic */ C35146k(C35154t c35154t, String str, int i12) {
        this.f292336b = i12;
        this.f292337c = c35154t;
        this.f292338d = str;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f292336b) {
            case 0:
                String str = this.f292338d;
                C35154t c35154t = this.f292337c;
                return kotlinx.coroutines.rx3.y.b(C43175k.G(new C35148m(c35154t, str, null))).S().r(C35149n.f292347b).u(new C32102w0(27)).z(c35154t.f292379b.a());
            case 1:
                String str2 = this.f292338d;
                C35154t c35154t2 = this.f292337c;
                return kotlinx.coroutines.rx3.y.b(C43175k.G(new C35151p(c35154t2, str2, null))).S().r(C35152q.f292353b).z(c35154t2.f292379b.a());
            default:
                C35154t c35154t3 = this.f292337c;
                com.avito.android.geo_common.interactor.g gVar = c35154t3.f292378a;
                String str3 = this.f292338d;
                return gVar.d(str3).S().r(new r(c35154t3, str3)).u(new C32102w0(26)).z(c35154t3.f292379b.a());
        }
    }
}
