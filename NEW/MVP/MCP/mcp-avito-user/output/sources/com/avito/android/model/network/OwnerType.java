package com.avito.android.model.network;

import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvitoOwner.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/model/network/OwnerType;", "", "a", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OwnerType {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ OwnerType[] f198023b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f198024c;

    /* compiled from: AvitoOwner.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/model/network/OwnerType$a;", "", "<init>", "()V", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        OwnerType[] ownerTypeArr = {new OwnerType("Team", 0), new OwnerType("Unit", 1)};
        f198023b = ownerTypeArr;
        f198024c = c.a(ownerTypeArr);
        new a(null);
    }

    public OwnerType() {
        throw null;
    }

    public static OwnerType valueOf(String str) {
        return (OwnerType) Enum.valueOf(OwnerType.class, str);
    }

    public static OwnerType[] values() {
        return (OwnerType[]) f198023b.clone();
    }
}
