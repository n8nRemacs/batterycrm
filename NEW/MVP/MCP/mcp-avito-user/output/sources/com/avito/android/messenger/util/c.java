package com.avito.android.messenger.util;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.o0;
import kotlin.text.C43044a;
import kotlin.text.C43066x;

/* compiled from: DbMaintenance.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/o0;", "byte", "", "invoke-7apg3OU", "(B)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class c extends N implements Y41.l<o0, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final c f197433l = new c();

    public c() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(o0 o0Var) {
        int i12 = o0Var.f406875b & 255;
        C43044a.a(16);
        return C43066x.R(2, Integer.toString(i12, 16));
    }
}
