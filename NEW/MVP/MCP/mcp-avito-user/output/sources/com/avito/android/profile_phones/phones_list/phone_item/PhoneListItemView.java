package com.avito.android.profile_phones.phones_list.phone_item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.profile_phones.phones_list.PhoneItem;
import j.InterfaceC42150f;
import kotlin.Metadata;

/* compiled from: PhoneListItemView.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/phone_item/PhoneListItemView;", "Lcom/avito/konveyor/adapter/b;", "StatusType", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhoneListItemView extends com.avito.konveyor.adapter.b {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f228145c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PhoneItem f228146b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhoneListItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/phone_item/PhoneListItemView$StatusType;", "", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StatusType {

        /* renamed from: c, reason: collision with root package name */
        public static final StatusType f228147c;

        /* renamed from: d, reason: collision with root package name */
        public static final StatusType f228148d;

        /* renamed from: e, reason: collision with root package name */
        public static final StatusType f228149e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ StatusType[] f228150f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f228151g;

        /* renamed from: b, reason: collision with root package name */
        public final int f228152b;

        static {
            StatusType statusType = new StatusType("RED", 0, R.attr.red);
            f228147c = statusType;
            StatusType statusType2 = new StatusType("BLUE", 1, R.attr.blue700);
            f228148d = statusType2;
            StatusType statusType3 = new StatusType("NONE", 2, R.attr.gray28);
            f228149e = statusType3;
            StatusType[] statusTypeArr = {statusType, statusType2, statusType3};
            f228150f = statusTypeArr;
            f228151g = kotlin.enums.c.a(statusTypeArr);
        }

        public StatusType(@InterfaceC42150f String str, int i12, int i13) {
            this.f228152b = i13;
        }

        public static StatusType valueOf(String str) {
            return (StatusType) Enum.valueOf(StatusType.class, str);
        }

        public static StatusType[] values() {
            return (StatusType[]) f228150f.clone();
        }
    }

    public PhoneListItemView(@k PhoneItem phoneItem) {
        super(phoneItem);
        this.f228146b = phoneItem;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f228146b.setOnClickListener(null);
    }
}
