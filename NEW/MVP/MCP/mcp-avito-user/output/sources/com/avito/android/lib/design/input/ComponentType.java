package com.avito.android.lib.design.input;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ComponentType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/input/ComponentType;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComponentType {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f179282c;

    /* renamed from: d, reason: collision with root package name */
    public static final ComponentType f179283d;

    /* renamed from: e, reason: collision with root package name */
    public static final ComponentType f179284e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ComponentType[] f179285f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f179286g;

    /* renamed from: b, reason: collision with root package name */
    public final int f179287b;

    /* compiled from: ComponentType.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/input/ComponentType$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        ComponentType componentType = new ComponentType("INPUT", 0, 0);
        f179283d = componentType;
        ComponentType componentType2 = new ComponentType("SELECT", 1, -1);
        f179284e = componentType2;
        ComponentType[] componentTypeArr = {componentType, componentType2};
        f179285f = componentTypeArr;
        f179286g = kotlin.enums.c.a(componentTypeArr);
        f179282c = new a(null);
    }

    public ComponentType(String str, int i12, int i13) {
        this.f179287b = i13;
    }

    public static ComponentType valueOf(String str) {
        return (ComponentType) Enum.valueOf(ComponentType.class, str);
    }

    public static ComponentType[] values() {
        return (ComponentType[]) f179285f.clone();
    }
}
