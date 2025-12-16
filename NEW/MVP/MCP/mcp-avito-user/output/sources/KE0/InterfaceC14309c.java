package Ke0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDuplicateResult;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import kotlin.Metadata;

/* compiled from: MergedPretendPremoderationOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LKe0/c;", "", "a", "b", "c", "LKe0/c$a;", "LKe0/c$b;", "LKe0/c$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ke0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC14309c {

    /* compiled from: MergedPretendPremoderationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKe0/c$a;", "LKe0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ke0.c$a */
    public static final class a implements InterfaceC14309c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f9584a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f9585b;

        public a(@k DeepLink deepLink, @l Bundle bundle) {
            this.f9584a = deepLink;
            this.f9585b = bundle;
        }
    }

    /* compiled from: MergedPretendPremoderationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKe0/c$b;", "LKe0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ke0.c$b */
    public static final class b implements InterfaceC14309c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AdvertDuplicateResult f9586a;

        public b(@k AdvertDuplicateResult advertDuplicateResult) {
            this.f9586a = advertDuplicateResult;
        }
    }

    /* compiled from: MergedPretendPremoderationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKe0/c$c;", "LKe0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ke0.c$c, reason: collision with other inner class name */
    public static final class C0588c implements InterfaceC14309c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AdvertProactiveModerationResult.WrongCategorySuggest f9587a;

        public C0588c(@k AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest) {
            this.f9587a = wrongCategorySuggest;
        }
    }
}
