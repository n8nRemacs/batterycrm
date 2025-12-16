package kotlin.reflect;

import kotlin.Metadata;
import kotlin.reflect.jvm.internal.T;

/* compiled from: KParameter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/KParameter;", "Lkotlin/reflect/b;", "Kind", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface KParameter extends b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: KParameter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/KParameter$Kind;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Kind {

        /* renamed from: b, reason: collision with root package name */
        public static final Kind f406942b;

        /* renamed from: c, reason: collision with root package name */
        public static final Kind f406943c;

        /* renamed from: d, reason: collision with root package name */
        public static final Kind f406944d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Kind[] f406945e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f406946f;

        static {
            Kind kind = new Kind("INSTANCE", 0);
            f406942b = kind;
            Kind kind2 = new Kind("EXTENSION_RECEIVER", 1);
            f406943c = kind2;
            Kind kind3 = new Kind("VALUE", 2);
            f406944d = kind3;
            Kind[] kindArr = {kind, kind2, kind3};
            f406945e = kindArr;
            f406946f = kotlin.enums.c.a(kindArr);
        }

        public Kind() {
            throw null;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) f406945e.clone();
        }
    }

    /* compiled from: KParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    boolean a();

    boolean b();

    int getIndex();

    @Y61.k
    Kind getKind();

    @Y61.l
    String getName();

    @Y61.k
    T getType();
}
