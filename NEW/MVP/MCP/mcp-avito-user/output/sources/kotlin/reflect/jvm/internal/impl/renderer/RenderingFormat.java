package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes8.dex */
public abstract class RenderingFormat {

    /* renamed from: b, reason: collision with root package name */
    public static final RenderingFormat f409461b;

    /* renamed from: c, reason: collision with root package name */
    public static final RenderingFormat f409462c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ RenderingFormat[] f409463d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f409464e;

    /* compiled from: DescriptorRenderer.kt */
    public static final class a extends RenderingFormat {
        public a() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        @Y61.k
        public final String a(@Y61.k String str) {
            return C43066x.a0(C43066x.a0(str, "<", "&lt;", false), ">", "&gt;", false);
        }
    }

    static {
        b bVar = new b("PLAIN", 0, null);
        f409461b = bVar;
        a aVar = new a("HTML", 1, null);
        f409462c = aVar;
        RenderingFormat[] renderingFormatArr = {bVar, aVar};
        f409463d = renderingFormatArr;
        f409464e = kotlin.enums.c.a(renderingFormatArr);
    }

    public RenderingFormat() {
        throw null;
    }

    public RenderingFormat(String str, int i12, C42822w c42822w) {
    }

    public static RenderingFormat valueOf(String str) {
        return (RenderingFormat) Enum.valueOf(RenderingFormat.class, str);
    }

    public static RenderingFormat[] values() {
        return (RenderingFormat[]) f409463d.clone();
    }

    @Y61.k
    public abstract String a(@Y61.k String str);

    /* compiled from: DescriptorRenderer.kt */
    public static final class b extends RenderingFormat {
        public b() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        @Y61.k
        public final String a(@Y61.k String str) {
            return str;
        }
    }
}
