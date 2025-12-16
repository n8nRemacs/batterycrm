package com.avito.android.iac_analytics.public_module.analytics_models;

import Y61.k;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MicAccessScenario.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_analytics/public_module/analytics_models/MicAccessScenario;", "", "a", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MicAccessScenario {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f164289b;

    /* renamed from: c, reason: collision with root package name */
    public static final MicAccessScenario f164290c;

    /* renamed from: d, reason: collision with root package name */
    public static final MicAccessScenario f164291d;

    /* renamed from: e, reason: collision with root package name */
    public static final MicAccessScenario f164292e;

    /* renamed from: f, reason: collision with root package name */
    public static final MicAccessScenario f164293f;

    /* renamed from: g, reason: collision with root package name */
    public static final MicAccessScenario f164294g;

    /* renamed from: h, reason: collision with root package name */
    public static final MicAccessScenario f164295h;

    /* renamed from: i, reason: collision with root package name */
    public static final MicAccessScenario f164296i;

    /* renamed from: j, reason: collision with root package name */
    public static final MicAccessScenario f164297j;

    /* renamed from: k, reason: collision with root package name */
    public static final MicAccessScenario f164298k;

    /* renamed from: l, reason: collision with root package name */
    public static final MicAccessScenario f164299l;

    /* renamed from: m, reason: collision with root package name */
    public static final MicAccessScenario f164300m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ MicAccessScenario[] f164301n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f164302o;

    /* compiled from: MicAccessScenario.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_analytics/public_module/analytics_models/MicAccessScenario$a;", "", "<init>", "()V", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static MicAccessScenario a(@k String str) {
            return str.equals(AttachMenuItem.Support.KEY) ? MicAccessScenario.f164295h : str.equals("incoming_call") ? MicAccessScenario.f164293f : MicAccessScenario.f164294g;
        }

        public a() {
        }
    }

    static {
        MicAccessScenario micAccessScenario = new MicAccessScenario("IAC_CHOSEN_SLOT", 0);
        f164290c = micAccessScenario;
        MicAccessScenario micAccessScenario2 = new MicAccessScenario("ITEM_PUBLISHING_BLOCK", 1);
        f164291d = micAccessScenario2;
        MicAccessScenario micAccessScenario3 = new MicAccessScenario("ITEM_PUBLISHING", 2);
        MicAccessScenario micAccessScenario4 = new MicAccessScenario("ITEM_EDITING", 3);
        f164292e = micAccessScenario4;
        MicAccessScenario micAccessScenario5 = new MicAccessScenario("INCOMING_CALL", 4);
        f164293f = micAccessScenario5;
        MicAccessScenario micAccessScenario6 = new MicAccessScenario("OUTGOING_CALL", 5);
        f164294g = micAccessScenario6;
        MicAccessScenario micAccessScenario7 = new MicAccessScenario("SUPPORT_CALL", 6);
        f164295h = micAccessScenario7;
        MicAccessScenario micAccessScenario8 = new MicAccessScenario("SETTINGS_TOGGLE", 7);
        f164296i = micAccessScenario8;
        MicAccessScenario micAccessScenario9 = new MicAccessScenario("AFTER_INCOMING_CALL", 8);
        f164297j = micAccessScenario9;
        MicAccessScenario micAccessScenario10 = new MicAccessScenario("ITEM_PUBLISHING_PERIODIC", 9);
        f164298k = micAccessScenario10;
        MicAccessScenario micAccessScenario11 = new MicAccessScenario("PRO_POPUP", 10);
        f164299l = micAccessScenario11;
        MicAccessScenario micAccessScenario12 = new MicAccessScenario("IAC_PROBLEMS_BOTTOM_SHEET", 11);
        f164300m = micAccessScenario12;
        MicAccessScenario[] micAccessScenarioArr = {micAccessScenario, micAccessScenario2, micAccessScenario3, micAccessScenario4, micAccessScenario5, micAccessScenario6, micAccessScenario7, micAccessScenario8, micAccessScenario9, micAccessScenario10, micAccessScenario11, micAccessScenario12};
        f164301n = micAccessScenarioArr;
        f164302o = c.a(micAccessScenarioArr);
        f164289b = new a(null);
    }

    public MicAccessScenario() {
        throw null;
    }

    public static MicAccessScenario valueOf(String str) {
        return (MicAccessScenario) Enum.valueOf(MicAccessScenario.class, str);
    }

    public static MicAccessScenario[] values() {
        return (MicAccessScenario[]) f164301n.clone();
    }
}
