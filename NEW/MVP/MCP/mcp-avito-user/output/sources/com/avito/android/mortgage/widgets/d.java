package com.avito.android.mortgage.widgets;

import Y41.l;
import androidx.compose.ui.focus.C22220e;
import androidx.compose.ui.focus.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: SmsCodeInput.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f204014l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f204015m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f204016n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f204017o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l<String, G0> f204018p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r f204019q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(String str, int i12, String str2, int i13, l<? super String, G0> lVar, r rVar) {
        super(1);
        this.f204014l = str;
        this.f204015m = i12;
        this.f204016n = str2;
        this.f204017o = i13;
        this.f204018p = lVar;
        this.f204019q = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        if (!str2.equals(this.f204014l)) {
            l<String, G0> lVar = this.f204018p;
            int i12 = this.f204015m;
            String str3 = this.f204016n;
            int i13 = this.f204017o;
            i.b(i12, str2, str3, i13, lVar);
            if (C43066x.A0(str2).toString().length() > 0 && i12 < i13 - 1) {
                C22220e.f39163b.getClass();
                this.f204019q.h(C22220e.f39164c);
            }
        }
        return G0.f406611a;
    }
}
