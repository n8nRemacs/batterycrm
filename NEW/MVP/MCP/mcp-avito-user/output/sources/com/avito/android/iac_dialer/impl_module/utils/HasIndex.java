package com.avito.android.iac_dialer.impl_module.utils;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.c;

/* compiled from: HasIndex.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/utils/HasIndex;", "", "a", "Type", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface HasIndex {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HasIndex.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/utils/HasIndex$Type;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f166506b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f166507c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f166508d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Type[] f166509e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f166510f;

        static {
            Type type = new Type("VOIP_STATE", 0);
            Type type2 = new Type("IAC_STATE", 1);
            f166506b = type2;
            Type type3 = new Type("CALL_SCREEN_UI_STATE", 2);
            f166507c = type3;
            Type type4 = new Type("SERVICE_UI_STATE", 3);
            Type type5 = new Type("OVERLAY_UI_STATE", 4);
            f166508d = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
            f166509e = typeArr;
            f166510f = c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f166509e.clone();
        }
    }

    /* compiled from: HasIndex.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/utils/HasIndex$a;", "", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    int getIndex();

    @k
    Type getIndexType();

    void setIndex(int i12);
}
