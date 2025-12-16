package com.avito.android.item_map.remote.model.route;

import com.google.gson.annotations.c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RouteResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/item_map/remote/model/route/Type;", "", "<init>", "(Ljava/lang/String;I)V", "Walking", "Driving", "_avito-discouraged_avito-api_item-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Type {

    @c("driving")
    public static final Type Driving;

    @c("walking")
    public static final Type Walking;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Type[] f173364b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f173365c;

    /* compiled from: RouteResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173366a;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.Walking.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.Driving.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f173366a = iArr;
        }
    }

    static {
        Type type = new Type("Walking", 0);
        Walking = type;
        Type type2 = new Type("Driving", 1);
        Driving = type2;
        Type[] typeArr = {type, type2};
        f173364b = typeArr;
        f173365c = kotlin.enums.c.a(typeArr);
    }

    private Type(String str, int i12) {
    }

    public static Type valueOf(String str) {
        return (Type) Enum.valueOf(Type.class, str);
    }

    public static Type[] values() {
        return (Type[]) f173364b.clone();
    }
}
