package com.avito.android.candy;

import Ag.CallableC13028a;
import android.graphics.Bitmap;
import com.avito.android.analytics.clickstream.I;
import io.reactivex.rxjava3.internal.operators.single.G;
import java.io.File;
import kotlin.Metadata;

/* compiled from: RemoteCarImageSource.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/graphics/Bitmap;", "it", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/candy/f$a;", "apply", "(Landroid/graphics/Bitmap;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class n<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f114902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f114903c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CandyImageState f114904d;

    public n(r rVar, String str, CandyImageState candyImageState) {
        this.f114902b = rVar;
        this.f114903c = str;
        this.f114904d = candyImageState;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        c cVar = this.f114902b.f114907b;
        cVar.getClass();
        File file = new File(cVar.f114878a.getCacheDir(), this.f114903c + '_' + this.f114904d.f114854b);
        return new G(new CallableC13028a(9, file, (Bitmap) obj)).z(cVar.f114879b.a()).i(new b(file)).u(new I(6));
    }
}
