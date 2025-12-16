package com.yandex.div.core.experiments;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: Experiment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/experiments/Experiment;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class Experiment {

    /* renamed from: c, reason: collision with root package name */
    public static final Experiment f367435c;

    /* renamed from: d, reason: collision with root package name */
    public static final Experiment f367436d;

    /* renamed from: e, reason: collision with root package name */
    public static final Experiment f367437e;

    /* renamed from: f, reason: collision with root package name */
    public static final Experiment f367438f;

    /* renamed from: g, reason: collision with root package name */
    public static final Experiment f367439g;

    /* renamed from: h, reason: collision with root package name */
    public static final Experiment f367440h;

    /* renamed from: i, reason: collision with root package name */
    public static final Experiment f367441i;

    /* renamed from: j, reason: collision with root package name */
    public static final Experiment f367442j;

    /* renamed from: k, reason: collision with root package name */
    public static final Experiment f367443k;

    /* renamed from: l, reason: collision with root package name */
    public static final Experiment f367444l;

    /* renamed from: m, reason: collision with root package name */
    public static final Experiment f367445m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ Experiment[] f367446n;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f367447b;

    static {
        Experiment experiment = new Experiment("TAP_BEACONS_ENABLED", 0, "tap_beacons_enabled", false, 2, null);
        f367435c = experiment;
        boolean z12 = false;
        int i12 = 2;
        C42822w c42822w = null;
        Experiment experiment2 = new Experiment("VISIBILITY_BEACONS_ENABLED", 1, "visibility_beacons_enabled", z12, i12, c42822w);
        f367436d = experiment2;
        boolean z13 = false;
        int i13 = 2;
        C42822w c42822w2 = null;
        Experiment experiment3 = new Experiment("LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED", 2, "longtap_actions_pass_to_child", z13, i13, c42822w2);
        f367437e = experiment3;
        Experiment experiment4 = new Experiment("IGNORE_ACTION_MENU_ITEMS_ENABLED", 3, "override_context_menu_handler", z12, i12, c42822w);
        f367438f = experiment4;
        Experiment experiment5 = new Experiment("HYPHENATION_SUPPORT_ENABLED", 4, "support_hyphenation", z13, i13, c42822w2);
        f367439g = experiment5;
        Experiment experiment6 = new Experiment("VISUAL_ERRORS_ENABLED", 5, "visual_errors", z12, i12, c42822w);
        f367440h = experiment6;
        Experiment experiment7 = new Experiment("ACCESSIBILITY_ENABLED", 6, "accessibility_enabled", z13, i13, c42822w2);
        f367441i = experiment7;
        Experiment experiment8 = new Experiment("VIEW_POOL_ENABLED", 7, true);
        f367442j = experiment8;
        Experiment experiment9 = new Experiment("VIEW_POOL_PROFILING_ENABLED", 8, "view_pool_profiling_enabled", false, 2, null);
        f367443k = experiment9;
        Experiment experiment10 = new Experiment("RESOURCE_CACHE_ENABLED", 9, true);
        f367444l = experiment10;
        Experiment experiment11 = new Experiment("SHOW_RENDERING_TIME", 10, false);
        Experiment experiment12 = new Experiment("MULTIPLE_STATE_CHANGE_ENABLED", 11, "multiple_state_change_enabled", false, 2, null);
        f367445m = experiment12;
        f367446n = new Experiment[]{experiment, experiment2, experiment3, experiment4, experiment5, experiment6, experiment7, experiment8, experiment9, experiment10, experiment11, experiment12, new Experiment("BIND_ON_ATTACH_ENABLED", 12, "bind_on_attach_enabled", false, 2, null)};
    }

    public /* synthetic */ Experiment(String str, int i12, String str2, boolean z12, int i13, C42822w c42822w) {
        this(str, i12, (i13 & 2) != 0 ? false : z12);
    }

    public static Experiment valueOf(String str) {
        return (Experiment) Enum.valueOf(Experiment.class, str);
    }

    public static Experiment[] values() {
        return (Experiment[]) f367446n.clone();
    }

    public Experiment(String str, int i12, boolean z12) {
        this.f367447b = z12;
    }
}
