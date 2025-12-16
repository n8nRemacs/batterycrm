package androidx.fragment.app.strictmode;

import X41.f;
import X41.n;
import Y61.k;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42782y0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: FragmentStrictMode.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode;", "", "<init>", "()V", "Flag", "a", "b", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FragmentStrictMode {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final FragmentStrictMode f46587a = new FragmentStrictMode();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final b f46588b = b.f46597b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FragmentStrictMode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Flag {

        /* renamed from: b, reason: collision with root package name */
        public static final Flag f46589b;

        /* renamed from: c, reason: collision with root package name */
        public static final Flag f46590c;

        /* renamed from: d, reason: collision with root package name */
        public static final Flag f46591d;

        /* renamed from: e, reason: collision with root package name */
        public static final Flag f46592e;

        /* renamed from: f, reason: collision with root package name */
        public static final Flag f46593f;

        /* renamed from: g, reason: collision with root package name */
        public static final Flag f46594g;

        /* renamed from: h, reason: collision with root package name */
        public static final Flag f46595h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ Flag[] f46596i;

        /* JADX INFO: Fake field, exist only in values array */
        Flag EF0;

        static {
            Flag flag = new Flag("PENALTY_LOG", 0);
            Flag flag2 = new Flag("PENALTY_DEATH", 1);
            Flag flag3 = new Flag("DETECT_FRAGMENT_REUSE", 2);
            f46589b = flag3;
            Flag flag4 = new Flag("DETECT_FRAGMENT_TAG_USAGE", 3);
            f46590c = flag4;
            Flag flag5 = new Flag("DETECT_WRONG_NESTED_HIERARCHY", 4);
            f46591d = flag5;
            Flag flag6 = new Flag("DETECT_RETAIN_INSTANCE_USAGE", 5);
            f46592e = flag6;
            Flag flag7 = new Flag("DETECT_SET_USER_VISIBLE_HINT", 6);
            f46593f = flag7;
            Flag flag8 = new Flag("DETECT_TARGET_FRAGMENT_USAGE", 7);
            f46594g = flag8;
            Flag flag9 = new Flag("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
            f46595h = flag9;
            f46596i = new Flag[]{flag, flag2, flag3, flag4, flag5, flag6, flag7, flag8, flag9};
        }

        public Flag() {
            throw null;
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) f46596i.clone();
        }
    }

    /* compiled from: FragmentStrictMode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$a;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
    }

    /* compiled from: FragmentStrictMode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$b;", "", "a", "b", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        @f
        @k
        public static final b f46597b;

        /* renamed from: a, reason: collision with root package name */
        @k
        public final B0 f46598a;

        /* compiled from: FragmentStrictMode.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$b$a;", "", "<init>", "()V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public a() {
                new LinkedHashSet();
                new LinkedHashMap();
            }
        }

        /* compiled from: FragmentStrictMode.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$b$b;", "", "<init>", "()V", "Landroidx/fragment/app/strictmode/FragmentStrictMode$b;", "LAX", "Landroidx/fragment/app/strictmode/FragmentStrictMode$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.fragment.app.strictmode.FragmentStrictMode$b$b, reason: collision with other inner class name */
        public static final class C1789b {
            public /* synthetic */ C1789b(C42822w c42822w) {
                this();
            }

            public C1789b() {
            }
        }

        static {
            new C1789b(null);
            f46597b = new b(B0.f406639b, P0.c());
        }

        public b(@k B0 b02, @k Map map) {
            this.f46598a = b02;
            new LinkedHashMap();
            ((B0) map.entrySet()).getClass();
            C42782y0.f406747b.getClass();
        }
    }

    public static b a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                fragment.getParentFragmentManager();
            }
            fragment = fragment.getParentFragment();
        }
        return f46588b;
    }

    public static void b(Violation violation) {
        if (Log.isLoggable("FragmentManager", 3)) {
            violation.f46599b.getClass();
        }
    }

    @n
    @RestrictTo
    public static final void c(@k Fragment fragment, @k String str) {
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        f46587a.getClass();
        b(fragmentReuseViolation);
        a(fragment).f46598a.getClass();
    }
}
