package com.avito.android.crm_candidates.view.base;

import android.os.Bundle;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobCrmAddNoteFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.crm_candidates.view.base.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29625c extends kotlin.jvm.internal.N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f129909l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f129910m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f129911n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f129912o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f129913p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f129914q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f129915r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29625c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(1);
        this.f129909l = str;
        this.f129910m = str2;
        this.f129911n = str3;
        this.f129912o = str4;
        this.f129913p = str5;
        this.f129914q = str6;
        this.f129915r = str7;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("ARG_CANDIDATE_NAME", this.f129909l);
        bundle2.putString("ARG_BUTTON_NAME", this.f129910m);
        bundle2.putString("ARG_NOTE_TEXT", this.f129911n);
        bundle2.putString("ARG_APPLICANT_ID", this.f129912o);
        bundle2.putString("ARG_APPLICATION_ID", this.f129913p);
        bundle2.putString("ARG_VACANCY_ID", this.f129914q);
        bundle2.putString("ARG_CV_ID", this.f129915r);
        return G0.f406611a;
    }
}
