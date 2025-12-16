package org.mockito.internal.util.concurrent;

/* loaded from: classes7.dex */
public class DetachedThreadLocal<T> implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final c<Thread, T> f421736b = new b(this);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Cleaner {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Cleaner[] f421737b = {new Cleaner("THREAD", 0), new Cleaner("INLINE", 1), new Cleaner("MANUAL", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Cleaner EF5;

        public Cleaner() {
            throw null;
        }

        public static Cleaner valueOf(String str) {
            return (Cleaner) Enum.valueOf(Cleaner.class, str);
        }

        public static Cleaner[] values() {
            return (Cleaner[]) f421737b.clone();
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f421738a;

        static {
            int[] iArr = new int[Cleaner.values().length];
            f421738a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f421738a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f421738a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f421736b.run();
    }
}
