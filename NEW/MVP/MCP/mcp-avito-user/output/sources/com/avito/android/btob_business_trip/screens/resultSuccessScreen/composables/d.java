package com.avito.android.btob_business_trip.screens.resultSuccessScreen.composables;

import Y41.l;
import android.net.Uri;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SuccessScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f108062l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f108063m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Uri f108064n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f108065o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f108066p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i12, int i13, Uri uri, String str, String str2) {
        super(1);
        this.f108062l = i12;
        this.f108063m = i13;
        this.f108064n = uri;
        this.f108065o = str;
        this.f108066p = str2;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        m0Var2.c(null, null, new C22096n(160625280, new b(this.f108064n, this.f108062l, this.f108063m), true));
        m0Var2.c(null, null, new C22096n(-438704137, new c(this.f108065o, this.f108066p), true));
        return G0.f406611a;
    }
}
