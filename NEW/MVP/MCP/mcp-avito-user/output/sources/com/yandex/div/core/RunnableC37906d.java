package com.yandex.div.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: DecodeBase64ImageTask.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/d;", "Ljava/lang/Runnable;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37906d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public String f367287b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f367288c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Bitmap, G0> f367289d;

    /* compiled from: DecodeBase64ImageTask.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.d$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Bitmap f367291m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Bitmap bitmap) {
            super(0);
            this.f367291m = bitmap;
        }

        @Override // Y41.a
        public final G0 invoke() {
            RunnableC37906d.this.f367289d.invoke(this.f367291m);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC37906d(@Y61.k String str, boolean z12, @Y61.k Y41.l<? super Bitmap, G0> lVar) {
        this.f367287b = str;
        this.f367288c = z12;
        this.f367289d = lVar;
    }

    @Override // java.lang.Runnable
    @j.l0
    public final void run() {
        String strSubstring = this.f367287b;
        if (C43066x.h0(strSubstring, "data:", false)) {
            strSubstring = strSubstring.substring(C43066x.H(',', 0, 6, strSubstring) + 1);
        }
        this.f367287b = strSubstring;
        try {
            byte[] bArrDecode = Base64.decode(strSubstring, 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            try {
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                if (this.f367288c) {
                    this.f367289d.invoke(bitmapDecodeByteArray);
                    return;
                }
                com.yandex.div.internal.util.u uVar = com.yandex.div.internal.util.u.f370187a;
                a aVar = new a(bitmapDecodeByteArray);
                uVar.getClass();
                com.yandex.div.internal.util.u.f370188b.post(new Oa1.B(5, aVar));
            } catch (IllegalArgumentException unused) {
                int i12 = com.yandex.div.internal.p.f370124a;
            }
        } catch (IllegalArgumentException unused2) {
            int i13 = com.yandex.div.internal.p.f370124a;
        }
    }
}
