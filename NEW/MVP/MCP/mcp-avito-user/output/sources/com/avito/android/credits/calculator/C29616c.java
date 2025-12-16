package com.avito.android.credits.calculator;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoLoansCreditCalculatorView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.credits.calculator.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29616c extends N implements Y41.l<Integer, String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C29615b f128672l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29616c(C29615b c29615b) {
        super(1);
        this.f128672l = c29615b;
    }

    @Override // Y41.l
    public final String invoke(Integer num) {
        return this.f128672l.B80(num.intValue(), false);
    }
}
