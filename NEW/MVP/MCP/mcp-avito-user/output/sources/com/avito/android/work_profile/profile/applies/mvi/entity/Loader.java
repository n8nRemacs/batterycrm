package com.avito.android.work_profile.profile.applies.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppliesToVacancyInternalAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/mvi/entity/Loader;", "", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Loader {

    /* renamed from: b, reason: collision with root package name */
    public static final Loader f330894b;

    /* renamed from: c, reason: collision with root package name */
    public static final Loader f330895c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Loader[] f330896d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f330897e;

    static {
        Loader loader = new Loader("FULL_PAGE_LOADER", 0);
        f330894b = loader;
        Loader loader2 = new Loader("PULL_TO_REFRESH_LOADER", 1);
        f330895c = loader2;
        Loader[] loaderArr = {loader, loader2};
        f330896d = loaderArr;
        f330897e = c.a(loaderArr);
    }

    public Loader() {
        throw null;
    }

    public static Loader valueOf(String str) {
        return (Loader) Enum.valueOf(Loader.class, str);
    }

    public static Loader[] values() {
        return (Loader[]) f330896d.clone();
    }
}
