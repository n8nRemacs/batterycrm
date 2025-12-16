package com.avito.android.mortgage.widgets;

import Y41.l;
import androidx.compose.ui.focus.C22220e;
import androidx.compose.ui.focus.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SmsCodeInput.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/key/c;", "it", "", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements l<androidx.compose.ui.input.key.c, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f204009l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f204010m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f204011n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l<String, G0> f204012o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r f204013p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(int i12, String str, int i13, l<? super String, G0> lVar, r rVar) {
        super(1);
        this.f204009l = i12;
        this.f204010m = str;
        this.f204011n = i13;
        this.f204012o = lVar;
        this.f204013p = rVar;
    }

    @Override // Y41.l
    public final Boolean invoke(androidx.compose.ui.input.key.c cVar) {
        boolean z12;
        long jA2 = androidx.compose.ui.input.key.i.a(cVar.f40068a.getKeyCode());
        androidx.compose.ui.input.key.b.f40052b.getClass();
        if (androidx.compose.ui.input.key.b.a(jA2, androidx.compose.ui.input.key.b.f40062l)) {
            int i12 = this.f204011n;
            l<String, G0> lVar = this.f204012o;
            int i13 = this.f204009l;
            i.b(i13, "", this.f204010m, i12, lVar);
            if (i13 > 0) {
                C22220e.f39163b.getClass();
                this.f204013p.h(C22220e.f39165d);
            }
            z12 = true;
        } else {
            z12 = false;
        }
        return Boolean.valueOf(z12);
    }
}
