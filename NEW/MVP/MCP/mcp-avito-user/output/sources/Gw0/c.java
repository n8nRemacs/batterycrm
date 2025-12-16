package GW0;

import I41.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.generic.RoundingParams;
import fX0.u;

/* compiled from: GenericDraweeHierarchyInflater.java */
/* loaded from: classes10.dex */
public class c {
    @h
    public static Drawable a(TypedArray typedArray, Context context, int i12) {
        int resourceId = typedArray.getResourceId(i12, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getResources().getDrawable(resourceId);
    }

    @u
    public static RoundingParams b(b bVar) {
        if (bVar.f6552q == null) {
            bVar.f6552q = new RoundingParams();
        }
        return bVar.f6552q;
    }

    @h
    public static s.a c(TypedArray typedArray, int i12) {
        switch (typedArray.getInt(i12, -2)) {
            case -1:
                return null;
            case 0:
                return (s.a) s.c.f340129a;
            case 1:
                return (s.a) s.c.f340132d;
            case 2:
                return (s.a) s.c.f340133e;
            case 3:
                return (s.a) s.c.f340134f;
            case 4:
                return (s.a) s.c.f340135g;
            case 5:
                return (s.a) s.c.f340136h;
            case 6:
                return (s.a) s.c.f340137i;
            case 7:
                return (s.a) s.c.f340138j;
            case 8:
                return (s.a) s.c.f340139k;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    public static b d(Context context, @h AttributeSet attributeSet) {
        com.facebook.imagepipeline.systrace.b.a();
        b bVar = new b(context.getResources());
        e(bVar, context, attributeSet);
        com.facebook.imagepipeline.systrace.b.a();
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01da A[PHI: r1 r2 r3
  0x01da: PHI (r1v19 boolean) = (r1v14 boolean), (r1v21 boolean) binds: [B:140:0x01fa, B:123:0x01d8] A[DONT_GENERATE, DONT_INLINE]
  0x01da: PHI (r2v14 boolean) = (r2v10 boolean), (r2v16 boolean) binds: [B:140:0x01fa, B:123:0x01d8] A[DONT_GENERATE, DONT_INLINE]
  0x01da: PHI (r3v10 boolean) = (r3v6 boolean), (r3v12 boolean) binds: [B:140:0x01fa, B:123:0x01d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01dc A[PHI: r1 r2 r3
  0x01dc: PHI (r1v16 boolean) = (r1v14 boolean), (r1v14 boolean), (r1v21 boolean), (r1v21 boolean) binds: [B:139:0x01f8, B:140:0x01fa, B:122:0x01d6, B:123:0x01d8] A[DONT_GENERATE, DONT_INLINE]
  0x01dc: PHI (r2v12 boolean) = (r2v10 boolean), (r2v10 boolean), (r2v16 boolean), (r2v16 boolean) binds: [B:139:0x01f8, B:140:0x01fa, B:122:0x01d6, B:123:0x01d8] A[DONT_GENERATE, DONT_INLINE]
  0x01dc: PHI (r3v8 boolean) = (r3v6 boolean), (r3v6 boolean), (r3v12 boolean), (r3v12 boolean) binds: [B:139:0x01f8, B:140:0x01fa, B:122:0x01d6, B:123:0x01d8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(GW0.b r18, android.content.Context r19, @I41.h android.util.AttributeSet r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: GW0.c.e(GW0.b, android.content.Context, android.util.AttributeSet):void");
    }
}
