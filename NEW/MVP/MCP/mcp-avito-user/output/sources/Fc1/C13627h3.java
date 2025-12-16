package Fc1;

import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.h3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13627h3 implements InterfaceC13590d2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L3 f5544a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5545b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f5546c = C42727D.c(new a());

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f5547d = C42727D.c(new b());

    /* renamed from: Fc1.h3$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<RenderScript> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final RenderScript invoke() {
            return RenderScript.create(C13627h3.this.f5544a.b());
        }
    }

    /* renamed from: Fc1.h3$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<ScriptIntrinsicBlur> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ScriptIntrinsicBlur invoke() {
            C13627h3 c13627h3 = C13627h3.this;
            return ScriptIntrinsicBlur.create((RenderScript) c13627h3.f5546c.getValue(), Element.U8_4((RenderScript) c13627h3.f5546c.getValue()));
        }
    }

    public C13627h3(@Y61.k L3 l32, int i12) {
        this.f5544a = l32;
        this.f5545b = i12;
    }

    @Override // Fc1.InterfaceC13590d2
    @Y61.k
    public final Bitmap a(@Y61.k Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        InterfaceC42726C interfaceC42726C = this.f5546c;
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap((RenderScript) interfaceC42726C.getValue(), bitmap.copy(config, true));
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap((RenderScript) interfaceC42726C.getValue(), bitmapCreateBitmap);
        InterfaceC42726C interfaceC42726C2 = this.f5547d;
        ((ScriptIntrinsicBlur) interfaceC42726C2.getValue()).setRadius(this.f5545b / 4.0f);
        ((ScriptIntrinsicBlur) interfaceC42726C2.getValue()).setInput(allocationCreateFromBitmap);
        ((ScriptIntrinsicBlur) interfaceC42726C2.getValue()).forEach(allocationCreateFromBitmap2);
        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
        bitmap.recycle();
        ((ScriptIntrinsicBlur) interfaceC42726C2.getValue()).destroy();
        ((RenderScript) interfaceC42726C.getValue()).destroy();
        return bitmapCreateBitmap;
    }
}
