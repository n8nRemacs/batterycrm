package com.avito.android.authorization.gorelkin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ParsingPermissionViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/gorelkin/PpFlow;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PpFlow {

    /* renamed from: b, reason: collision with root package name */
    public static final PpFlow f93887b;

    /* renamed from: c, reason: collision with root package name */
    public static final PpFlow f93888c;

    /* renamed from: d, reason: collision with root package name */
    public static final PpFlow f93889d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ PpFlow[] f93890e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f93891f;

    static {
        PpFlow ppFlow = new PpFlow("SOCIAL", 0);
        f93887b = ppFlow;
        PpFlow ppFlow2 = new PpFlow("REGISTRATION", 1);
        f93888c = ppFlow2;
        PpFlow ppFlow3 = new PpFlow("SOCIAL_PROCEED", 2);
        f93889d = ppFlow3;
        PpFlow[] ppFlowArr = {ppFlow, ppFlow2, ppFlow3};
        f93890e = ppFlowArr;
        f93891f = kotlin.enums.c.a(ppFlowArr);
    }

    public PpFlow() {
        throw null;
    }

    public static PpFlow valueOf(String str) {
        return (PpFlow) Enum.valueOf(PpFlow.class, str);
    }

    public static PpFlow[] values() {
        return (PpFlow[]) f93890e.clone();
    }
}
