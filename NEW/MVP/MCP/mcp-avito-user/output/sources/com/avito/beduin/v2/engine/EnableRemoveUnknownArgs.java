package com.avito.beduin.v2.engine;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScenarioFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/EnableRemoveUnknownArgs;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EnableRemoveUnknownArgs {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f336442c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnableRemoveUnknownArgs[] f336443d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f336444e;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f336445b;

    /* compiled from: ScenarioFeatures.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/EnableRemoveUnknownArgs$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        EnableRemoveUnknownArgs[] enableRemoveUnknownArgsArr = {new EnableRemoveUnknownArgs("TRUE", 0, "true"), new EnableRemoveUnknownArgs("FALSE", 1, "false")};
        f336443d = enableRemoveUnknownArgsArr;
        f336444e = kotlin.enums.c.a(enableRemoveUnknownArgsArr);
        f336442c = new a(null);
    }

    public EnableRemoveUnknownArgs(String str, int i12, String str2) {
        this.f336445b = str2;
    }

    public static EnableRemoveUnknownArgs valueOf(String str) {
        return (EnableRemoveUnknownArgs) Enum.valueOf(EnableRemoveUnknownArgs.class, str);
    }

    public static EnableRemoveUnknownArgs[] values() {
        return (EnableRemoveUnknownArgs[]) f336443d.clone();
    }
}
