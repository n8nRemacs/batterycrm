package com.avito.android.advertising.adapter.items.buzzoola;

import android.graphics.Bitmap;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BuzzoolaPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LYW0/f;", "it", "Lkotlin/G0;", "invoke", "(LYW0/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class l extends N implements Y41.l<YW0.f, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BuzzoolaBanner.BuzzoolaDirect f87309l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f87310m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advertising.ui.buzzoola.d f87311n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(BuzzoolaBanner.BuzzoolaDirect buzzoolaDirect, p pVar, com.avito.android.advertising.ui.buzzoola.d dVar) {
        super(1);
        this.f87309l = buzzoolaDirect;
        this.f87310m = pVar;
        this.f87311n = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(YW0.f fVar) {
        YW0.f fVar2 = fVar;
        YW0.a aVar = fVar2 instanceof YW0.a ? (YW0.a) fVar2 : null;
        if (aVar != null && !aVar.isClosed()) {
            BuzzoolaBanner.BuzzoolaDirect buzzoolaDirect = this.f87309l;
            if (buzzoolaDirect.f88228o == null) {
                Bitmap bitmapD = ((YW0.a) fVar2).d();
                if (!bitmapD.isRecycled()) {
                    this.f87310m.f87375g.b(bitmapD, buzzoolaDirect.f88215b.toString()).x(new j(buzzoolaDirect, this.f87311n), k.f87308b);
                }
            }
        }
        return G0.f406611a;
    }
}
