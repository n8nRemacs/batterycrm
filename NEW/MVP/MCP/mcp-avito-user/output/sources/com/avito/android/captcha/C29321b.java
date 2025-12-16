package com.avito.android.captcha;

import android.text.Editable;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: AvitoCaptchaHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.captcha.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29321b extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C29327h f114969l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Input f114970m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29321b(C29327h c29327h, Input input) {
        super(1);
        this.f114969l = c29327h;
        this.f114970m = input;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        num.intValue();
        this.f114969l.getClass();
        Editable editableM53getText = this.f114970m.m53getText();
        String string = editableM53getText != null ? editableM53getText.toString() : null;
        if (string == null) {
            string = "";
        }
        C43066x.K(string);
        return G0.f406611a;
    }
}
