package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.Rect;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.divs.C37989q;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import v21.C49153a;

/* compiled from: DivBackgroundBinder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/s;", "Lcom/yandex/div/core/Y;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.divs.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37994s extends com.yandex.div.core.Y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.internal.drawable.c f368698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C37989q.a.c f368699b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37994s(C38029k c38029k, com.yandex.div.internal.drawable.c cVar, C37989q.a.c cVar2) {
        super(c38029k);
        this.f368698a = cVar;
        this.f368699b = cVar2;
    }

    @Override // v21.b
    @j.j0
    public final void b(@Y61.k C49153a c49153a) {
        Rect rect = this.f368699b.f368626b;
        int i12 = rect.bottom;
        com.yandex.div.internal.drawable.c cVar = this.f368698a;
        cVar.f370107a = i12;
        cVar.invalidateSelf();
        cVar.f370108b = rect.left;
        cVar.invalidateSelf();
        cVar.f370109c = rect.right;
        cVar.invalidateSelf();
        cVar.f370110d = rect.top;
        cVar.invalidateSelf();
        Bitmap bitmap = c49153a.f440420a;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i13 = cVar.f370107a;
        int i14 = cVar.f370108b;
        int i15 = cVar.f370109c;
        int i16 = cVar.f370110d;
        int i17 = height - i13;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.put((byte) 2);
        byteBufferOrder.put((byte) 2);
        byteBufferOrder.put((byte) 9);
        int i18 = 0;
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(i14);
        byteBufferOrder.putInt(width - i15);
        byteBufferOrder.putInt(i16);
        byteBufferOrder.putInt(i17);
        while (i18 < 9) {
            i18++;
            byteBufferOrder.putInt(1);
        }
        cVar.f370111e = new NinePatch(bitmap, byteBufferOrder.array());
        cVar.invalidateSelf();
    }
}
