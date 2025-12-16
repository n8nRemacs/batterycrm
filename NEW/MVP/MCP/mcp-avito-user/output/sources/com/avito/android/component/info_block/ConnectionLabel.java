package com.avito.android.component.info_block;

import com.avito.android.R;
import hw.InterfaceC41178c;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConnectionLabel.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/info_block/ConnectionLabel;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ConnectionLabel {

    /* renamed from: c, reason: collision with root package name */
    public static final ConnectionLabel f125214c;

    /* renamed from: d, reason: collision with root package name */
    public static final ConnectionLabel f125215d;

    /* renamed from: e, reason: collision with root package name */
    public static final ConnectionLabel f125216e;

    /* renamed from: f, reason: collision with root package name */
    public static final ConnectionLabel f125217f;

    /* renamed from: g, reason: collision with root package name */
    public static final ConnectionLabel f125218g;

    /* renamed from: h, reason: collision with root package name */
    public static final ConnectionLabel f125219h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ConnectionLabel[] f125220i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a f125221j;

    /* renamed from: b, reason: collision with root package name */
    public final int f125222b;

    static {
        ConnectionLabel connectionLabel = new ConnectionLabel("VK", 0, R.drawable.ic_profile_vk);
        f125214c = connectionLabel;
        ConnectionLabel connectionLabel2 = new ConnectionLabel("GOOGLE_PLUS", 1, R.drawable.ic_profile_gp);
        f125215d = connectionLabel2;
        ConnectionLabel connectionLabel3 = new ConnectionLabel("OK", 2, R.drawable.ic_profile_ok);
        f125216e = connectionLabel3;
        ConnectionLabel connectionLabel4 = new ConnectionLabel("MAIL", 3, R.drawable.ic_profile_mail);
        ConnectionLabel connectionLabel5 = new ConnectionLabel("PHONE", 4, R.drawable.ic_profile_phone);
        ConnectionLabel connectionLabel6 = new ConnectionLabel("ESIA", 5, R.drawable.ic_profile_esia);
        f125217f = connectionLabel6;
        ConnectionLabel connectionLabel7 = new ConnectionLabel("APPLE", 6, R.drawable.ic_profile_apple);
        f125218g = connectionLabel7;
        ConnectionLabel connectionLabel8 = new ConnectionLabel("AVITO_FAKE", 7, R.drawable.ic_profile_avito_fake);
        f125219h = connectionLabel8;
        ConnectionLabel[] connectionLabelArr = {connectionLabel, connectionLabel2, connectionLabel3, connectionLabel4, connectionLabel5, connectionLabel6, connectionLabel7, connectionLabel8};
        f125220i = connectionLabelArr;
        f125221j = c.a(connectionLabelArr);
    }

    public ConnectionLabel(@InterfaceC42165v String str, int i12, int i13) {
        this.f125222b = i13;
    }

    public static ConnectionLabel valueOf(String str) {
        return (ConnectionLabel) Enum.valueOf(ConnectionLabel.class, str);
    }

    public static ConnectionLabel[] values() {
        return (ConnectionLabel[]) f125220i.clone();
    }
}
