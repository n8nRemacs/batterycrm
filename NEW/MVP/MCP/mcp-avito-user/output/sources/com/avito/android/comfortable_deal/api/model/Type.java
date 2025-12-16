package com.avito.android.comfortable_deal.api.model;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SortInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/Type;", "", "(Ljava/lang/String;I)V", "CREATED", "UPDATED", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Type {

    @c("created_at")
    public static final Type CREATED;

    @c("updated_at")
    public static final Type UPDATED;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Type[] f119777b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f119778c;

    static {
        Type type = new Type("CREATED", 0);
        CREATED = type;
        Type type2 = new Type("UPDATED", 1);
        UPDATED = type2;
        Type[] typeArr = {type, type2};
        f119777b = typeArr;
        f119778c = kotlin.enums.c.a(typeArr);
    }

    private Type(String str, int i12) {
    }

    public static Type valueOf(String str) {
        return (Type) Enum.valueOf(Type.class, str);
    }

    public static Type[] values() {
        return (Type[]) f119777b.clone();
    }
}
