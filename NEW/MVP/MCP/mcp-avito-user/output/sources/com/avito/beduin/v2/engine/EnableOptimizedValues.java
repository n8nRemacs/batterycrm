package com.avito.beduin.v2.engine;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScenarioFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/EnableOptimizedValues;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EnableOptimizedValues {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnableOptimizedValues[] f336432b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f336433c;

    /* compiled from: ScenarioFeatures.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/EnableOptimizedValues$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        EnableOptimizedValues[] enableOptimizedValuesArr = {new EnableOptimizedValues("TRUE", 0), new EnableOptimizedValues("FALSE", 1)};
        f336432b = enableOptimizedValuesArr;
        f336433c = kotlin.enums.c.a(enableOptimizedValuesArr);
        new a(null);
    }

    public EnableOptimizedValues() {
        throw null;
    }

    public static EnableOptimizedValues valueOf(String str) {
        return (EnableOptimizedValues) Enum.valueOf(EnableOptimizedValues.class, str);
    }

    public static EnableOptimizedValues[] values() {
        return (EnableOptimizedValues[]) f336432b.clone();
    }
}
