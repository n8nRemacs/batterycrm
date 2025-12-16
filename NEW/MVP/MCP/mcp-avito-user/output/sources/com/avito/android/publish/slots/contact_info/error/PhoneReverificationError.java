package com.avito.android.publish.slots.contact_info.error;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;

/* compiled from: PhoneReverificationError.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/contact_info/error/PhoneReverificationError;", "Lcom/avito/android/remote/error/ApiError$Custom;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhoneReverificationError extends ApiError.Custom {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f243251c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f243252d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f243253e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f243254f;

    public PhoneReverificationError(@k String str, @k String str2, @l String str3, boolean z12) {
        super(null, 1, null);
        this.f243251c = str;
        this.f243252d = str2;
        this.f243253e = str3;
        this.f243254f = z12;
    }
}
