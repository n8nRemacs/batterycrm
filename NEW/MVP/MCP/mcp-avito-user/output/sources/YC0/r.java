package yc0;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExtendedProfileSettingsState.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lyc0/r;", "", "a", "b", "Lyc0/r$a;", "Lyc0/r$b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f443330a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final UploadImage.Type f443331b;

    /* compiled from: ExtendedProfileSettingsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/r$a;", "Lyc0/r;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends r {
    }

    /* compiled from: ExtendedProfileSettingsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/r$b;", "Lyc0/r;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends r {

        /* renamed from: c, reason: collision with root package name */
        public final int f443332c;

        /* renamed from: d, reason: collision with root package name */
        public final int f443333d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f443334e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f443335f;

        public b(@Y61.k String str, @Y61.k UploadImage.Type type, int i12, int i13, @Y61.k String str2, @Y61.k String str3) {
            super(str, type, null);
            this.f443332c = i12;
            this.f443333d = i13;
            this.f443334e = str2;
            this.f443335f = str3;
        }
    }

    public r(String str, UploadImage.Type type, C42822w c42822w) {
        this.f443330a = str;
        this.f443331b = type;
    }
}
