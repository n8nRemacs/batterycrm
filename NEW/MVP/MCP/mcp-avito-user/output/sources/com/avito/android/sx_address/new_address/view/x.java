package com.avito.android.sx_address.new_address.view;

import android.text.Editable;
import com.avito.android.lib.design.input.Input;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: TitleItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class x extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f294006l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f294007m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, String str) {
        super(0);
        this.f294006l = zVar;
        this.f294007m = str;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        String str;
        boolean z12;
        z zVar = this.f294006l;
        Editable editableM53getText = zVar.f294010b.m53getText();
        Input input = zVar.f294010b;
        if ((editableM53getText != null && !C43066x.K(editableM53getText)) || (str = this.f294007m) == null || C43066x.K(str)) {
            Input.f179303W.getClass();
            input.setState(Input.f179304a0);
            z12 = false;
        } else {
            Input.f179303W.getClass();
            input.setState(Input.f179305b0);
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}
