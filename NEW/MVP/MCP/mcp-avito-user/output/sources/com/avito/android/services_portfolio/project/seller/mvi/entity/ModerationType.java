package com.avito.android.services_portfolio.project.seller.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProjectSeller.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_portfolio/project/seller/mvi/entity/ModerationType;", "", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ModerationType {

    /* renamed from: b, reason: collision with root package name */
    public static final ModerationType f280254b;

    /* renamed from: c, reason: collision with root package name */
    public static final ModerationType f280255c;

    /* renamed from: d, reason: collision with root package name */
    public static final ModerationType f280256d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ModerationType[] f280257e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f280258f;

    static {
        ModerationType moderationType = new ModerationType("REJECTED", 0);
        f280254b = moderationType;
        ModerationType moderationType2 = new ModerationType("IN_PROGRESS", 1);
        f280255c = moderationType2;
        ModerationType moderationType3 = new ModerationType("APPROVED", 2);
        f280256d = moderationType3;
        ModerationType[] moderationTypeArr = {moderationType, moderationType2, moderationType3};
        f280257e = moderationTypeArr;
        f280258f = c.a(moderationTypeArr);
    }

    public ModerationType() {
        throw null;
    }

    public static ModerationType valueOf(String str) {
        return (ModerationType) Enum.valueOf(ModerationType.class, str);
    }

    public static ModerationType[] values() {
        return (ModerationType[]) f280257e.clone();
    }
}
