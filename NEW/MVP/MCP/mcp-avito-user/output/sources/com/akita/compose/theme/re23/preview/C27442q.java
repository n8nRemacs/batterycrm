package com.akita.compose.theme.re23.preview;

import android.content.Context;
import android.widget.Toast;
import kotlin.Metadata;

/* compiled from: BannerPreview.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.akita.compose.theme.re23.preview.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27442q extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f65799l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27442q(Context context) {
        super(0);
        this.f65799l = context;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        Toast.makeText(this.f65799l, "Button clicked!", 0).show();
        return kotlin.G0.f406611a;
    }
}
