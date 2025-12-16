package com.avito.android.virtual_deal_room_reference_category.generated.api.create_process_api;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: CreateProcessApiResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/generated/api/create_process_api/CreateProcessApiResponse;", "", "", "processId", "Lcom/avito/android/virtual_deal_room_reference_category/generated/api/create_process_api/CreateProcessApiResponse$Type;", "type", "<init>", "(Ljava/lang/String;Lcom/avito/android/virtual_deal_room_reference_category/generated/api/create_process_api/CreateProcessApiResponse$Type;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/virtual_deal_room_reference_category/generated/api/create_process_api/CreateProcessApiResponse$Type;", "b", "()Lcom/avito/android/virtual_deal_room_reference_category/generated/api/create_process_api/CreateProcessApiResponse$Type;", "Type", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CreateProcessApiResponse {

    @c("processId")
    @k
    private final String processId;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreateProcessApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/generated/api/create_process_api/CreateProcessApiResponse$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Example1", "Example2", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("example1")
        public static final Type Example1;

        @c("example2")
        public static final Type Example2;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Type[] f327224c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f327225d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f327226b;

        static {
            Type type = new Type("Example1", 0, "example1");
            Example1 = type;
            Type type2 = new Type("Example2", 1, "example2");
            Example2 = type2;
            Type[] typeArr = {type, type2};
            f327224c = typeArr;
            f327225d = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
            this.f327226b = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f327224c.clone();
        }
    }

    public CreateProcessApiResponse(@k String str, @k Type type) {
        this.processId = str;
        this.type = type;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getProcessId() {
        return this.processId;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
