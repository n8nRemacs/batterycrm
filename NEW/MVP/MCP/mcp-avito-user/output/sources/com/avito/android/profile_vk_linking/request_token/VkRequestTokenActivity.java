package com.avito.android.profile_vk_linking.request_token;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: VkRequestTokenActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_vk_linking/request_token/VkRequestTokenActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "Params", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VkRequestTokenActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* compiled from: VkRequestTokenActivity.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/request_token/VkRequestTokenActivity$Params;", "Landroid/os/Parcelable;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Params implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Params> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f231335b;

        /* compiled from: VkRequestTokenActivity.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Params> {
            @Override // android.os.Parcelable.Creator
            public final Params createFromParcel(Parcel parcel) {
                return new Params(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Params[] newArray(int i12) {
                return new Params[i12];
            }
        }

        public Params(@Y61.k String str) {
            this.f231335b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Params) && L.f(this.f231335b, ((Params) obj).f231335b);
        }

        public final int hashCode() {
            return this.f231335b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Params(url="), this.f231335b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f231335b);
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        Params params;
        super.onCreate(bundle);
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                params = (Params) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("extra_key", Params.class) : extras.getParcelable("extra_key"));
            } else {
                params = null;
            }
            if (params == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            VkRequestTokenFragment.f231336q0.getClass();
            VkRequestTokenFragment vkRequestTokenFragment = new VkRequestTokenFragment();
            C35966w1.a(vkRequestTokenFragment, -1, new c(params.f231335b));
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, vkRequestTokenFragment, "vk_request_token_fragment", 1);
            hE2.f();
        }
    }
}
