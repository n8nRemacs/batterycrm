package com.yandex.div.core.view2.divs.widgets;

import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.div.core.dagger.InterfaceC37908b;
import com.yandex.div2.AbstractC38386j1;
import com.yandex.div2.I;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImageUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class z {

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "com/yandex/div/core/util/n", "core-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f369015b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bitmap f369016c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f369017d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InterfaceC37908b f369018e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.json.expressions.e f369019f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ N f369020g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l lVar, Bitmap bitmap, View view, InterfaceC37908b interfaceC37908b, com.yandex.div.json.expressions.e eVar, List list) {
            this.f369015b = view;
            this.f369016c = bitmap;
            this.f369017d = list;
            this.f369018e = interfaceC37908b;
            this.f369019f = eVar;
            this.f369020g = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r2v10, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            float height = this.f369015b.getHeight();
            Bitmap bitmap = this.f369016c;
            float fMax = Math.max(height / bitmap.getHeight(), r1.getWidth() / bitmap.getWidth());
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMax), (int) (fMax * bitmap.getHeight()), false);
            for (AbstractC38386j1 abstractC38386j1 : this.f369017d) {
                if (abstractC38386j1 instanceof AbstractC38386j1.a) {
                    bitmapCreateScaledBitmap = z.b(bitmapCreateScaledBitmap, ((AbstractC38386j1.a) abstractC38386j1).f375416c, this.f369018e, this.f369019f);
                }
            }
            this.f369020g.invoke(bitmapCreateScaledBitmap);
        }
    }

    public static final void a(@Y61.k Y41.l lVar, @Y61.k Bitmap bitmap, @Y61.k View view, @Y61.k InterfaceC37908b interfaceC37908b, @Y61.k com.yandex.div.json.expressions.e eVar, @Y61.l List list) {
        if (list == null) {
            lVar.invoke(bitmap);
            return;
        }
        if (!com.yandex.div.core.util.q.b(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new a(lVar, bitmap, view, interfaceC37908b, eVar, list));
            return;
        }
        float fMax = Math.max(view.getHeight() / bitmap.getHeight(), view.getWidth() / bitmap.getWidth());
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMax), (int) (fMax * bitmap.getHeight()), false);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC38386j1 abstractC38386j1 = (AbstractC38386j1) it.next();
            if (abstractC38386j1 instanceof AbstractC38386j1.a) {
                bitmapCreateScaledBitmap = b(bitmapCreateScaledBitmap, ((AbstractC38386j1.a) abstractC38386j1).f375416c, interfaceC37908b, eVar);
            }
        }
        lVar.invoke(bitmapCreateScaledBitmap);
    }

    @Y61.k
    public static final Bitmap b(@Y61.k Bitmap bitmap, @Y61.k I i12, @Y61.k InterfaceC37908b interfaceC37908b, @Y61.k com.yandex.div.json.expressions.e eVar) {
        int i13;
        float f12;
        long jLongValue = i12.f372541a.a(eVar).longValue();
        long j12 = jLongValue >> 31;
        if (j12 == 0 || j12 == -1) {
            i13 = (int) jLongValue;
        } else {
            int i14 = com.yandex.div.internal.n.f370123a;
            i13 = jLongValue > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
        }
        if (i13 == 0) {
            return bitmap;
        }
        int iA2 = com.yandex.div.internal.util.p.a(i13);
        int i15 = 25;
        if (iA2 > 25) {
            f12 = (iA2 * 1.0f) / 25;
        } else {
            i15 = iA2;
            f12 = 1.0f;
        }
        if (f12 != 1.0f) {
            bitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / f12), (int) (bitmap.getHeight() / f12), false);
        }
        RenderScript renderScriptD = interfaceC37908b.d();
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptD, bitmap);
        Allocation allocationCreateTyped = Allocation.createTyped(renderScriptD, allocationCreateFromBitmap.getType());
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptD, Element.U8_4(renderScriptD));
        scriptIntrinsicBlurCreate.setRadius(i15);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
        allocationCreateTyped.copyTo(bitmap);
        return bitmap;
    }
}
