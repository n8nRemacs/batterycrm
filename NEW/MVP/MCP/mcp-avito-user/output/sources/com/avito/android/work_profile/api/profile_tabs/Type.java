package com.avito.android.work_profile.api.profile_tabs;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProfileTabsResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/work_profile/api/profile_tabs/Type;", "", "(Ljava/lang/String;I)V", "ABOUT", "CVS", "APPLIES", "GIG", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Type {

    @c("about")
    public static final Type ABOUT;

    @c("applies")
    public static final Type APPLIES;

    @c("cvs")
    public static final Type CVS;

    @c("gig")
    public static final Type GIG;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Type[] f330600b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f330601c;

    static {
        Type type = new Type("ABOUT", 0);
        ABOUT = type;
        Type type2 = new Type("CVS", 1);
        CVS = type2;
        Type type3 = new Type("APPLIES", 2);
        APPLIES = type3;
        Type type4 = new Type("GIG", 3);
        GIG = type4;
        Type[] typeArr = {type, type2, type3, type4};
        f330600b = typeArr;
        f330601c = kotlin.enums.c.a(typeArr);
    }

    private Type(String str, int i12) {
    }

    public static Type valueOf(String str) {
        return (Type) Enum.valueOf(Type.class, str);
    }

    public static Type[] values() {
        return (Type[]) f330600b.clone();
    }
}
