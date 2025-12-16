package com.otaliastudios.opengl.draw;

import java.nio.FloatBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import t11.C48460a;

/* compiled from: GlRoundRect.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/otaliastudios/opengl/draw/i;", "Lcom/otaliastudios/opengl/draw/a;", "<init>", "()V", "a", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class i extends com.otaliastudios.opengl.draw.a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final FloatBuffer f365928d;

    /* compiled from: GlRoundRect.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/otaliastudios/opengl/draw/i$a;", "", "<init>", "()V", "", "POINTS_PER_CORNER", "I", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public i() {
        FloatBuffer floatBufferA = C48460a.a(this.f365918c * 82);
        this.f365928d = floatBufferA;
        floatBufferA.clear();
        floatBufferA.put(0.0f);
        floatBufferA.put(0.0f);
        floatBufferA.put(-1.0f);
        floatBufferA.put(1.0f);
        floatBufferA.put(1.0f);
        floatBufferA.put(1.0f);
        floatBufferA.put(1.0f);
        floatBufferA.put(-1.0f);
        floatBufferA.put(-1.0f);
        floatBufferA.put(-1.0f);
        floatBufferA.put(floatBufferA.get(2));
        floatBufferA.put(floatBufferA.get(3));
        floatBufferA.flip();
        this.f365921b++;
    }

    @Override // com.otaliastudios.opengl.draw.f
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final FloatBuffer getF365928d() {
        return this.f365928d;
    }
}
