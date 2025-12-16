package kotlin.text;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CharDirectionality.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/text/CharDirectionality;", "", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CharDirectionality {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C<Map<Integer, CharDirectionality>> f410572c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CharDirectionality[] f410573d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f410574e;

    /* renamed from: b, reason: collision with root package name */
    public final int f410575b;

    /* compiled from: CharDirectionality.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lkotlin/text/CharDirectionality;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Map<Integer, ? extends CharDirectionality>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f410576l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Map<Integer, ? extends CharDirectionality> invoke() {
            List list = CharDirectionality.f410574e;
            int iF2 = P0.f(C42745f0.q(list, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            Iterator it = ((AbstractC42738c) list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                linkedHashMap.put(Integer.valueOf(((CharDirectionality) next).f410575b), next);
            }
            return linkedHashMap;
        }
    }

    /* compiled from: CharDirectionality.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/text/CharDirectionality$b;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        CharDirectionality[] charDirectionalityArr = {new CharDirectionality("UNDEFINED", 0, -1), new CharDirectionality("LEFT_TO_RIGHT", 1, 0), new CharDirectionality("RIGHT_TO_LEFT", 2, 1), new CharDirectionality("RIGHT_TO_LEFT_ARABIC", 3, 2), new CharDirectionality("EUROPEAN_NUMBER", 4, 3), new CharDirectionality("EUROPEAN_NUMBER_SEPARATOR", 5, 4), new CharDirectionality("EUROPEAN_NUMBER_TERMINATOR", 6, 5), new CharDirectionality("ARABIC_NUMBER", 7, 6), new CharDirectionality("COMMON_NUMBER_SEPARATOR", 8, 7), new CharDirectionality("NONSPACING_MARK", 9, 8), new CharDirectionality("BOUNDARY_NEUTRAL", 10, 9), new CharDirectionality("PARAGRAPH_SEPARATOR", 11, 10), new CharDirectionality("SEGMENT_SEPARATOR", 12, 11), new CharDirectionality("WHITESPACE", 13, 12), new CharDirectionality("OTHER_NEUTRALS", 14, 13), new CharDirectionality("LEFT_TO_RIGHT_EMBEDDING", 15, 14), new CharDirectionality("LEFT_TO_RIGHT_OVERRIDE", 16, 15), new CharDirectionality("RIGHT_TO_LEFT_EMBEDDING", 17, 16), new CharDirectionality("RIGHT_TO_LEFT_OVERRIDE", 18, 17), new CharDirectionality("POP_DIRECTIONAL_FORMAT", 19, 18)};
        f410573d = charDirectionalityArr;
        f410574e = kotlin.enums.c.a(charDirectionalityArr);
        new b(null);
        f410572c = C42727D.c(a.f410576l);
    }

    public CharDirectionality(String str, int i12, int i13) {
        this.f410575b = i13;
    }

    public static CharDirectionality valueOf(String str) {
        return (CharDirectionality) Enum.valueOf(CharDirectionality.class, str);
    }

    public static CharDirectionality[] values() {
        return (CharDirectionality[]) f410573d.clone();
    }
}
