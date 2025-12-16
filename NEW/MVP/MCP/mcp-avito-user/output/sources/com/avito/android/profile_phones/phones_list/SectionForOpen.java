package com.avito.android.profile_phones.phones_list;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SectionForOpen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/SectionForOpen;", "", "a", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SectionForOpen {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f227421b;

    /* renamed from: c, reason: collision with root package name */
    public static final SectionForOpen f227422c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SectionForOpen[] f227423d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f227424e;

    /* compiled from: SectionForOpen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/SectionForOpen$a;", "", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        SectionForOpen sectionForOpen = new SectionForOpen("TIME_RANGE_PICKER", 0);
        f227422c = sectionForOpen;
        SectionForOpen[] sectionForOpenArr = {sectionForOpen};
        f227423d = sectionForOpenArr;
        f227424e = kotlin.enums.c.a(sectionForOpenArr);
        f227421b = new a(null);
    }

    public SectionForOpen() {
        throw null;
    }

    public static SectionForOpen valueOf(String str) {
        return (SectionForOpen) Enum.valueOf(SectionForOpen.class, str);
    }

    public static SectionForOpen[] values() {
        return (SectionForOpen[]) f227423d.clone();
    }
}
