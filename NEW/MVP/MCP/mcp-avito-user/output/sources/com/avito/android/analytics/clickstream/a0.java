package com.avito.android.analytics.clickstream;

import kotlin.Metadata;

/* compiled from: FieldConverter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "elem", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class a0 extends kotlin.jvm.internal.N implements Y41.l<Object, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b0 f89778l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var) {
        super(1);
        this.f89778l = b0Var;
    }

    @Override // Y41.l
    public final CharSequence invoke(Object obj) {
        boolean z12 = obj instanceof Float;
        b0 b0Var = this.f89778l;
        if (z12) {
            return b0Var.f89779a.f89777a.format(((Number) obj).floatValue());
        }
        if (!(obj instanceof Double)) {
            return String.valueOf(obj);
        }
        return b0Var.f89779a.f89777a.format(((Number) obj).doubleValue());
    }
}
