package ru.avito.messenger.internal;

import com.avito.android.remote.model.RawJson;
import com.avito.android.remote.model.messenger.context_actions.RecommendationsResponse;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.geo.GeoPoint;
import com.avito.android.remote.model.messenger.geo.GeoSearchSuggests;
import com.avito.android.remote.model.messenger.geo.MarkersRequest;
import com.avito.android.remote.model.messenger.get_settings.GetSettingsRequest;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggestsResponse;
import com.avito.android.remote.model.messenger.quick_replies.QuickRepliesResponse;
import com.avito.android.remote.model.messenger.video.VideosResponse;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.N4;
import com.avito.android.util.W4;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.observable.C41979p1;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k91.AbstractC42547e;
import k91.AbstractC42548f;
import k91.InterfaceC42546d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import mx0.InterfaceC44149a;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerApi;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.BlacklistReasons;
import ru.avito.messenger.api.entity.BlacklistUserRequest;
import ru.avito.messenger.api.entity.BlockedUser;
import ru.avito.messenger.api.entity.BlockedUsersResponse;
import ru.avito.messenger.api.entity.BodyImagesResponse;
import ru.avito.messenger.api.entity.Channel;
import ru.avito.messenger.api.entity.ChannelsCounters;
import ru.avito.messenger.api.entity.ChannelsResponse;
import ru.avito.messenger.api.entity.ChatMessage;
import ru.avito.messenger.api.entity.CreateFileResponse;
import ru.avito.messenger.api.entity.CreateVoiceFileResponse;
import ru.avito.messenger.api.entity.FoldersCountersResponse;
import ru.avito.messenger.api.entity.GetChannelFilters;
import ru.avito.messenger.api.entity.GetFileResponse;
import ru.avito.messenger.api.entity.GetLastActionTimesResponse;
import ru.avito.messenger.api.entity.Image;
import ru.avito.messenger.api.entity.PinUnpinChannelResponse;
import ru.avito.messenger.api.entity.SuccessResponse;
import ru.avito.messenger.api.entity.UserLastActivity;
import ru.avito.messenger.api.entity.body.item.BodyItem;
import ru.avito.messenger.internal.D;
import ru.avito.messenger.internal.connection.InterfaceC47751d;
import ru.avito.messenger.k0;
import yk0.C50261a;

/* compiled from: MessengerClientImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/messenger/internal/d;", "Lru/avito/messenger/z;", "Lcom/avito/android/util/N4;", "a", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ru.avito.messenger.internal.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47773d implements InterfaceC47842z, N4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47751d> f431388a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f431389b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.analytics.messenger.j f431390c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f431391d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f431392e;

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/Q;", "Lru/avito/messenger/api/entity/ChannelsResponse;", "", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$A */
    public static final class A<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ GetChannelFilters f431393b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C47773d f431394c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.a<io.reactivex.rxjava3.core.I<kotlin.Q<ChannelsResponse, Long>>> f431395d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Long f431396e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f431397f;

        /* JADX WARN: Multi-variable type inference failed */
        public A(GetChannelFilters getChannelFilters, C47773d c47773d, Y41.a<? extends io.reactivex.rxjava3.core.I<kotlin.Q<ChannelsResponse, Long>>> aVar, Long l12, int i12) {
            this.f431393b = getChannelFilters;
            this.f431394c = c47773d;
            this.f431395d = aVar;
            this.f431396e = l12;
            this.f431397f = i12;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            MessengerApi messengerApi = (MessengerApi) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            GetChannelFilters getChannelFilters = this.f431393b;
            if (!getChannelFilters.getTags().isEmpty()) {
                linkedHashMap.put("tags", getChannelFilters.getTags());
            }
            if (!getChannelFilters.getExcludeTags().isEmpty()) {
                linkedHashMap.put("excludeTags", getChannelFilters.getExcludeTags());
            }
            Boolean unreadOnly = getChannelFilters.getUnreadOnly();
            Boolean bool = Boolean.TRUE;
            if (kotlin.jvm.internal.L.f(unreadOnly, bool)) {
                linkedHashMap.put("unreadOnly", bool);
            }
            if (!getChannelFilters.getItemIds().isEmpty()) {
                linkedHashMap.put("itemIds", getChannelFilters.getItemIds());
            }
            l0.g gVar = new l0.g();
            gVar.f406841b = System.currentTimeMillis();
            Y41.a<io.reactivex.rxjava3.core.I<kotlin.Q<ChannelsResponse, Long>>> aVar = this.f431395d;
            io.reactivex.rxjava3.core.I<T> iF2 = this.f431394c.F(aVar != null ? aVar.invoke() : messengerApi.o(this.f431396e, this.f431397f, linkedHashMap).j(new k(gVar)).r(new l(gVar)), "avito.getChats.v5");
            getChannelFilters.toString();
            return iF2;
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChannelsCounters;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$B */
    public static final class B<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final B<T, R> f431398b = new B<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).getChatCounters();
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/GetFileResponse;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$C */
    public static final class C<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431399b;

        public C(String str) {
            this.f431399b = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).getFile(this.f431399b);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/FoldersCountersResponse;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$D */
    public static final class D<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map<String, Collection<String>> f431400b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Boolean f431401c;

        /* JADX WARN: Multi-variable type inference failed */
        public D(Map<String, ? extends Collection<String>> map, Boolean bool) {
            this.f431400b = map;
            this.f431401c = bool;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).getFolderCounters(this.f431400b, this.f431401c);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "", "Lcom/avito/android/remote/model/messenger/geo/GeoMarker;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$E */
    public static final class E<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MarkersRequest f431402b;

        public E(MarkersRequest markersRequest) {
            this.f431402b = markersRequest;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            MarkersRequest markersRequest = this.f431402b;
            return ((MessengerApi) obj).getGeoMarkers(markersRequest.getMethod(), markersRequest.getParams());
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/messenger/geo/GeoSearchSuggests;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$F */
    public static final class F<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431403b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f431404c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ GeoPoint f431405d;

        public F(String str, String str2, GeoPoint geoPoint) {
            this.f431403b = str;
            this.f431404c = str2;
            this.f431405d = geoPoint;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).getGeoSearchSuggests(this.f431403b, this.f431404c, this.f431405d);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lyk0/a;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$G */
    public static final class G<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431406b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f431407c;

        public G(String str, String str2) {
            this.f431406b = str;
            this.f431407c = str2;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).getPhoneByChannelId(this.f431406b, this.f431407c);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/messenger/quick_replies/QuickRepliesResponse;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$H */
    public static final class H<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final H<T, R> f431408b = new H<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).getQuickReplies();
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/messenger/context_actions/RecommendationsResponse;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$I */
    public static final class I<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431409b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RawJson f431410c;

        public I(String str, RawJson rawJson) {
            this.f431409b = str;
            this.f431410c = rawJson;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).getRecommendations(this.f431409b, this.f431410c);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/messenger/message_suggests/MessageSuggestsResponse;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$J */
    public static final class J<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431411b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f431412c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f431413d;

        public J(String str, String str2, String str3) {
            this.f431411b = str;
            this.f431412c = str2;
            this.f431413d = str3;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).getSellerSuggests(this.f431411b, this.f431412c, this.f431413d);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "", "", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$K */
    public static final class K<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<String> f431414b;

        public K(List<String> list) {
            this.f431414b = list;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).getUnknownMessageBodies(this.f431414b);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/GetLastActionTimesResponse;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$L */
    public static final class L<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<String> f431415b;

        public L(List<String> list) {
            this.f431415b = list;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).getUserLastActionTimes(this.f431415b);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/avito/messenger/api/entity/UserLastActivity;", "it", "Lru/avito/messenger/api/entity/GetLastActionTimesResponse;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.internal.d$M */
    public static final class M<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final M<T, R> f431416b = new M<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((GetLastActionTimesResponse) obj).getUsers();
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/messenger/video/VideosResponse;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$N */
    public static final class N<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<String> f431417b;

        public N(List<String> list) {
            this.f431417b = list;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).getVideos(this.f431417b);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "", "", "Lru/avito/messenger/api/entity/GetFileResponse;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$O */
    public static final class O<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<String> f431418b;

        public O(List<String> list) {
            this.f431418b = list;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).getVoiceFile(this.f431418b);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "", "", "Lcom/avito/android/remote/model/messenger/voice/VoiceInfo;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$P */
    public static final class P<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<String> f431419b;

        public P(List<String> list) {
            this.f431419b = list;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).getVoiceInfos(this.f431419b);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$Q */
    public static final class Q<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<io.reactivex.rxjava3.core.I<G0>> f431420b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<String> f431421c;

        /* JADX WARN: Multi-variable type inference failed */
        public Q(Y41.a<? extends io.reactivex.rxjava3.core.I<G0>> aVar, List<String> list) {
            this.f431420b = aVar;
            this.f431421c = list;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            MessengerApi messengerApi = (MessengerApi) obj;
            Y41.a<io.reactivex.rxjava3.core.I<G0>> aVar = this.f431420b;
            return aVar != null ? aVar.invoke() : messengerApi.markChannelsAsRead(this.f431421c);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "apply", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$R */
    public static final class R<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final R<T, R> f431422b = new R<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return G0.f406611a;
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$S */
    public static final class S<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<String> f431423b;

        public S(List<String> list) {
            this.f431423b = list;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).markChannelsAsUnread(this.f431423b);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "apply", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$T */
    public static final class T<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final T<T, R> f431424b = new T<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            ((Boolean) obj).booleanValue();
            return G0.f406611a;
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmx0/a;", "EventT", "Lk91/e$s;", "it", "", "test", "(Lk91/e$s;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$V */
    public static final class V<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mx0.e f431426b;

        public V(mx0.e eVar) {
            this.f431426b = eVar;
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return kotlin.jvm.internal.L.f(((AbstractC42547e.s) obj).f406132a, this.f431426b);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmx0/a;", "EventT", "Lk91/e$s;", "it", "apply", "(Lk91/e$s;)Lmx0/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$W */
    public static final class W<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final W<T, R> f431427b = new W<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((AbstractC42547e.s) obj).getValue();
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk91/e$v;", "it", "LX81/x;", "apply", "(Lk91/e$v;)LX81/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$X */
    public static final class X<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final X<T, R> f431428b = new X<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return new X81.x(((AbstractC42547e.v) obj).getValue());
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/PinUnpinChannelResponse;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$Y */
    public static final class Y<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431429b;

        public Y(String str) {
            this.f431429b = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).pinChannel(this.f431429b);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "recovered", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.internal.d$Z */
    public static final class Z<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final Z<T> f431430b = new Z<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return !((Boolean) obj).booleanValue();
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/internal/d$a;", "", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.internal.d$a, reason: case insensitive filesystem */
    public static final /* data */ class C47774a {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C47774a)) {
                return false;
            }
            ((C47774a) obj).getClass();
            return kotlin.jvm.internal.L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "ChannelsWithResponseTime(channels=null, time=0)";
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "apply", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$a0 */
    public static final class a0<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a0<T, R> f431431b = new a0<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            ((Boolean) obj).booleanValue();
            return G0.f406611a;
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$b, reason: case insensitive filesystem */
    public static final class C47775b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431432b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f431433c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f431434d;

        public C47775b(String str, String str2, String str3) {
            this.f431432b = str;
            this.f431433c = str2;
            this.f431434d = str3;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).abortChunkedUpload(this.f431432b, this.f431433c, this.f431434d);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/SuccessResponse;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$b0 */
    public static final class b0<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431435b;

        public b0(String str) {
            this.f431435b = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).removeFromBlackList(this.f431435b);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$c, reason: case insensitive filesystem */
    public static final class C47776c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431436b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f431437c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f431438d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Long f431439e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f431440f;

        public C47776c(String str, String str2, String str3, Long l12, String str4) {
            this.f431436b = str;
            this.f431437c = str2;
            this.f431438d = str3;
            this.f431439e = l12;
            this.f431440f = str4;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).addToBlackList(Collections.singletonList(new BlacklistUserRequest(this.f431436b, this.f431437c, this.f431438d)), this.f431439e, this.f431440f);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "apply", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$d, reason: collision with other inner class name */
    public static final class C12407d<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final C12407d<T, R> f431442b = new C12407d<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return G0.f406611a;
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$d0 */
    public static final class d0<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431443b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f431444c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f431445d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f431446e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Integer f431447f;

        public d0(String str, String str2, String str3, String str4, Integer num) {
            this.f431443b = str;
            this.f431444c = str2;
            this.f431445d = str3;
            this.f431446e = str4;
            this.f431447f = num;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).sendFileMessage(this.f431443b, this.f431444c, this.f431445d, this.f431446e, this.f431447f);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/internal/connection/d$b;", VoiceInfo.STATE, "", "test", "(Lru/avito/messenger/internal/connection/d$b;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$e, reason: case insensitive filesystem */
    public static final class C47777e<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final C47777e<T> f431448b = new C47777e<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((InterfaceC47751d.b) obj) instanceof InterfaceC47751d.b.a;
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$e0 */
    public static final class e0<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431449b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f431450c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f431451d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f431452e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Integer f431453f;

        public e0(String str, String str2, String str3, String str4, Integer num) {
            this.f431449b = str;
            this.f431450c = str2;
            this.f431451d = str3;
            this.f431452e = str4;
            this.f431453f = num;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).sendImageMessage(this.f431449b, this.f431450c, this.f431451d, this.f431452e, this.f431453f);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/internal/connection/d$b;", VoiceInfo.STATE, "", "apply", "(Lru/avito/messenger/internal/connection/d$b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$f, reason: case insensitive filesystem */
    public static final class C47778f<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final C47778f<T, R> f431454b = new C47778f<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return Boolean.valueOf(((InterfaceC47751d.b) obj) instanceof InterfaceC47751d.b.a);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$f0 */
    public static final class f0<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431455b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f431456c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f431457d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f431458e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Integer f431459f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f431460g;

        public f0(String str, String str2, String str3, Integer num, String str4, String str5) {
            this.f431455b = str;
            this.f431456c = str2;
            this.f431457d = str3;
            this.f431458e = str4;
            this.f431459f = num;
            this.f431460g = str5;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).sendItemMessage(this.f431455b, this.f431456c, this.f431457d, this.f431458e, this.f431459f, this.f431460g);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/internal/connection/d$b$a;", VoiceInfo.STATE, "", "apply", "(Lru/avito/messenger/internal/connection/d$b$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$g, reason: case insensitive filesystem */
    public static final class C47779g<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final C47779g<T, R> f431461b = new C47779g<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return Boolean.valueOf(((InterfaceC47751d.b.a) obj).f431290b);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$g0 */
    public static final class g0<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431462b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f431463c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f431464d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f431465e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Integer f431466f;

        public g0(String str, String str2, String str3, String str4, Integer num) {
            this.f431462b = str;
            this.f431463c = str2;
            this.f431464d = str3;
            this.f431465e = str4;
            this.f431466f = num;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).sendLinkMessage(this.f431462b, this.f431463c, this.f431464d, this.f431465e, this.f431466f);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/RawJson;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$h, reason: case insensitive filesystem */
    public static final class C47780h<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431467b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RawJson f431468c;

        public C47780h(String str, RawJson rawJson) {
            this.f431467b = str;
            this.f431468c = rawJson;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).callMethod(this.f431467b, this.f431468c);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$h0 */
    public static final class h0<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431469b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ double f431470c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ double f431471d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f431472e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f431473f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f431474g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f431475h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Integer f431476i;

        public h0(String str, double d12, double d13, String str2, String str3, String str4, String str5, Integer num) {
            this.f431469b = str;
            this.f431470c = d12;
            this.f431471d = d13;
            this.f431472e = str2;
            this.f431473f = str3;
            this.f431474g = str4;
            this.f431475h = str5;
            this.f431476i = num;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).sendLocationMessage(this.f431469b, this.f431470c, this.f431471d, this.f431472e, this.f431473f, this.f431474g, this.f431475h, this.f431476i);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$i, reason: case insensitive filesystem */
    public static final class C47781i<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431477b;

        public C47781i(String str) {
            this.f431477b = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).clearHistory(Collections.singletonList(this.f431477b));
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$i0 */
    public static final class i0<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431478b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f431479c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f431480d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f431481e;

        public i0(String str, String str2, String str3, String str4) {
            this.f431478b = str;
            this.f431479c = str2;
            this.f431480d = str3;
            this.f431481e = str4;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).sendReactionMessage(this.f431478b, this.f431479c, this.f431480d, this.f431481e);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.internal.d$j, reason: case insensitive filesystem */
    public static final class C47782j<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431482b;

        public C47782j(String str) {
            this.f431482b = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            ((Boolean) obj).booleanValue();
            return this.f431482b;
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$j0 */
    public static final class j0<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<io.reactivex.rxjava3.core.I<ChatMessage>> f431483b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C47773d f431484c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f431485d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f431486e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f431487f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List<String> f431488g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f431489h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Integer f431490i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f431491j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Long f431492k;

        /* JADX WARN: Multi-variable type inference failed */
        public j0(Y41.a<? extends io.reactivex.rxjava3.core.I<ChatMessage>> aVar, C47773d c47773d, String str, String str2, String str3, List<String> list, String str4, Integer num, String str5, Long l12) {
            this.f431483b = aVar;
            this.f431484c = c47773d;
            this.f431485d = str;
            this.f431486e = str2;
            this.f431487f = str3;
            this.f431488g = list;
            this.f431489h = str4;
            this.f431490i = num;
            this.f431491j = str5;
            this.f431492k = l12;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            MessengerApi messengerApi = (MessengerApi) obj;
            Y41.a<io.reactivex.rxjava3.core.I<ChatMessage>> aVar = this.f431483b;
            if (aVar != null) {
                return aVar.invoke();
            }
            return this.f431484c.F(messengerApi.sendTextMessage(this.f431485d, this.f431486e, this.f431487f, this.f431488g, this.f431489h, this.f431490i, this.f431491j, this.f431492k), "avito.sendTextMessage.v2");
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$k, reason: case insensitive filesystem */
    public static final class C47783k<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431493b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f431494c;

        public C47783k(String str, String str2) {
            this.f431493b = str;
            this.f431494c = str2;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).confirmChatAsNonSpam(this.f431493b, this.f431494c);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$k0 */
    public static final class k0<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431495b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<String> f431496c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Long f431497d;

        public k0(Long l12, List list, String str) {
            this.f431495b = str;
            this.f431496c = list;
            this.f431497d = l12;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).sendTyping(this.f431495b, this.f431496c, this.f431497d);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$l, reason: case insensitive filesystem */
    public static final class C47784l<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431498b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f431499c;

        public C47784l(String str, String str2) {
            this.f431498b = str;
            this.f431499c = str2;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).confirmChatAsSpam(this.f431498b, this.f431499c);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$l0 */
    public static final class l0<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431500b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f431501c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f431502d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f431503e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f431504f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Integer f431505g;

        public l0(String str, String str2, String str3, Integer num, String str4, String str5) {
            this.f431500b = str;
            this.f431501c = str2;
            this.f431502d = str3;
            this.f431503e = str4;
            this.f431504f = str5;
            this.f431505g = num;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).sendVideoMessage(this.f431500b, this.f431501c, this.f431502d, this.f431503e, this.f431504f, this.f431505g);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/Channel;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$m, reason: case insensitive filesystem */
    public static final class C47785m<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<io.reactivex.rxjava3.core.I<Channel>> f431506b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C47773d f431507c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f431508d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f431509e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f431510f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f431511g;

        /* JADX WARN: Multi-variable type inference failed */
        public C47785m(Y41.a<? extends io.reactivex.rxjava3.core.I<Channel>> aVar, C47773d c47773d, String str, String str2, String str3, String str4) {
            this.f431506b = aVar;
            this.f431507c = c47773d;
            this.f431508d = str;
            this.f431509e = str2;
            this.f431510f = str3;
            this.f431511g = str4;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            MessengerApi messengerApi = (MessengerApi) obj;
            Y41.a<io.reactivex.rxjava3.core.I<Channel>> aVar = this.f431506b;
            if (aVar != null) {
                return aVar.invoke();
            }
            return this.f431507c.F(messengerApi.createChat(this.f431508d, this.f431509e, this.f431510f, this.f431511g), "avito.chatCreateByItemId.v2");
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$m0 */
    public static final class m0<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431512b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f431513c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f431514d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f431515e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f431516f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Integer f431517g;

        public m0(String str, String str2, String str3, Integer num, String str4, String str5) {
            this.f431512b = str;
            this.f431513c = str2;
            this.f431514d = str3;
            this.f431515e = str4;
            this.f431516f = str5;
            this.f431517g = num;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).sendVoiceMessage(this.f431512b, this.f431513c, this.f431514d, this.f431515e, this.f431516f, this.f431517g);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/Channel;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$n, reason: case insensitive filesystem */
    public static final class C47786n<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431518b;

        public C47786n(String str) {
            this.f431518b = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).createChatByOpponentUser(this.f431518b);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/internal/connection/d$b;", VoiceInfo.STATE, "Lru/avito/messenger/k0;", "apply", "(Lru/avito/messenger/internal/connection/d$b;)Lru/avito/messenger/k0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$n0 */
    public static final class n0<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final n0<T, R> f431519b = new n0<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            Object aVar;
            InterfaceC47751d.b bVar = (InterfaceC47751d.b) obj;
            if (!(bVar instanceof InterfaceC47751d.b.c)) {
                if (bVar instanceof InterfaceC47751d.b.AbstractC12404b.C12405b ? true : bVar instanceof InterfaceC47751d.b.AbstractC12404b.a) {
                    return new k0.b(false, 1, null);
                }
                if (!(bVar instanceof InterfaceC47751d.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new k0.a(((InterfaceC47751d.b.a) bVar).f431292d);
            } else {
                if (((InterfaceC47751d.b.c) bVar).f431297a) {
                    return new k0.b(false, 1, null);
                }
                AbstractC42548f c11606f = ((InterfaceC47751d.b.c) bVar).f431298b;
                if (c11606f == null) {
                    c11606f = new AbstractC42548f.C11606f(null, null, null, 7, null);
                }
                aVar = new k0.c(c11606f, 0L, 2, null);
            }
            return aVar;
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/Channel;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$o, reason: case insensitive filesystem */
    public static final class C47787o<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431520b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f431521c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f431522d;

        public C47787o(String str, String str2, String str3) {
            this.f431520b = str;
            this.f431521c = str2;
            this.f431522d = str3;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).createChatWithAvito(this.f431520b, this.f431521c, this.f431522d);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/k0;", VoiceInfo.STATE, "", "kotlin.jvm.PlatformType", "apply", "(Lru/avito/messenger/k0;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$o0 */
    public static final class o0<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final o0<T, R> f431523b = new o0<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((ru.avito.messenger.k0) obj).getClass().getName();
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/CreateFileResponse;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$p, reason: case insensitive filesystem */
    public static final class C47788p<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431524b;

        public C47788p(String str) {
            this.f431524b = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).createFile(this.f431524b);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "error", "Lio/reactivex/rxjava3/core/O;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$p0 */
    public static final class p0<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f431526c;

        public p0(String str) {
            this.f431526c = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Throwable th2 = (Throwable) obj;
            boolean z12 = th2 instanceof j91.d;
            String str = this.f431526c;
            C47773d c47773d = C47773d.this;
            if (!z12) {
                c47773d.f431390c.b(str, th2);
                return io.reactivex.rxjava3.core.I.l(th2);
            }
            com.avito.android.remote.analytics.messenger.j jVar = c47773d.f431390c;
            j91.d dVar = (j91.d) th2;
            Throwable th3 = dVar.f405452b;
            Throwable th4 = dVar.f405453c;
            if (th4 == null) {
                th4 = th3;
            }
            jVar.b(str, th4);
            return io.reactivex.rxjava3.core.I.l(th3);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/CreateVoiceFileResponse;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$q, reason: case insensitive filesystem */
    public static final class C47789q<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431527b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f431528c;

        public C47789q(String str, long j12) {
            this.f431527b = str;
            this.f431528c = j12;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).createVoiceFile(this.f431527b, this.f431528c);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/PinUnpinChannelResponse;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$q0 */
    public static final class q0<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431529b;

        public q0(String str) {
            this.f431529b = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).unpinChannel(this.f431529b);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$r, reason: case insensitive filesystem */
    public static final class C47790r<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431530b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f431531c;

        public C47790r(String str, String str2) {
            this.f431530b = str;
            this.f431531c = str2;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).deleteMessage(this.f431530b, this.f431531c);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lru/avito/messenger/MessengerApi;", "Lru/avito/websocket/y;", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$r0 */
    public static final class r0<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MessengerUserHashInfo f431532b;

        public r0(MessengerUserHashInfo messengerUserHashInfo) {
            this.f431532b = messengerUserHashInfo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
        @Override // l41.o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object apply(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.Q r6 = (kotlin.Q) r6
                A r0 = r6.f406619b
                ru.avito.messenger.MessengerApi r0 = (ru.avito.messenger.MessengerApi) r0
                B r6 = r6.f406620c
                ru.avito.websocket.y r6 = (ru.avito.websocket.y) r6
                java.lang.String r1 = r6.f431965a
                ru.avito.messenger.MessengerUserHashInfo r2 = r5.f431532b
                if (r2 == 0) goto L13
                java.lang.String r3 = r2.f430682d
                goto L14
            L13:
                r3 = 0
            L14:
                if (r2 == 0) goto L37
                ru.avito.messenger.MessengerUserType r2 = r2.f430681c
                if (r2 == 0) goto L37
                boolean r4 = r2 instanceof ru.avito.messenger.MessengerUserType.Default
                if (r4 == 0) goto L21
                ru.avito.websocket.y$b$a r2 = ru.avito.websocket.y.b.a.f431967a
                goto L2e
            L21:
                boolean r4 = r2 instanceof ru.avito.messenger.MessengerUserType.Employee.Company
                if (r4 == 0) goto L28
                ru.avito.websocket.y$b$b r2 = ru.avito.websocket.y.b.C12412b.f431968a
                goto L2e
            L28:
                boolean r2 = r2 instanceof ru.avito.messenger.MessengerUserType.Employee.Personal
                if (r2 == 0) goto L31
                ru.avito.websocket.y$b$c r2 = ru.avito.websocket.y.b.c.f431969a
            L2e:
                if (r2 != 0) goto L39
                goto L37
            L31:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            L37:
                ru.avito.websocket.y$b$a r2 = ru.avito.websocket.y.b.a.f431967a
            L39:
                if (r1 == 0) goto L63
                boolean r4 = kotlin.text.C43066x.K(r1)
                if (r4 == 0) goto L42
                goto L63
            L42:
                if (r3 == 0) goto L63
                boolean r4 = kotlin.text.C43066x.K(r3)
                if (r4 == 0) goto L4b
                goto L63
            L4b:
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L59
                ru.avito.websocket.y$b r6 = r6.f431966b
                boolean r6 = kotlin.jvm.internal.L.f(r6, r2)
                if (r6 != 0) goto L63
            L59:
                ru.avito.messenger.internal.MessengerInconsistentUserInRequestAndSocket r6 = new ru.avito.messenger.internal.MessengerInconsistentUserInRequestAndSocket
                r6.<init>()
                io.reactivex.rxjava3.internal.operators.single.x r6 = io.reactivex.rxjava3.core.I.l(r6)
                goto L67
            L63:
                io.reactivex.rxjava3.internal.operators.single.M r6 = io.reactivex.rxjava3.core.I.q(r0)
            L67:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.avito.messenger.internal.C47773d.r0.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$s, reason: case insensitive filesystem */
    public static final class C47791s<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431533b;

        public C47791s(String str) {
            this.f431533b = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).deleteQuickReply(this.f431533b);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/BlockedUsersResponse;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$t, reason: case insensitive filesystem */
    public static final class C47792t<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f431534b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Integer f431535c;

        public C47792t(int i12, Integer num) {
            this.f431534b = i12;
            this.f431535c = num;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).getBlacklist(this.f431534b, this.f431535c);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/BlacklistReasons;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$v, reason: case insensitive filesystem */
    public static final class C47794v<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final C47794v<T, R> f431537b = new C47794v<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).getBlacklistReasons();
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/BodyImagesResponse;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$w, reason: case insensitive filesystem */
    public static final class C47795w<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Collection<String> f431538b;

        public C47795w(Collection<String> collection) {
            this.f431538b = collection;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).getBodyImages(this.f431538b);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "Lru/avito/messenger/api/entity/Image;", "it", "Lru/avito/messenger/api/entity/BodyImagesResponse;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.internal.d$x, reason: case insensitive filesystem */
    public static final class C47796x<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final C47796x<T, R> f431539b = new C47796x<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((BodyImagesResponse) obj).getImages();
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "", "Lru/avito/messenger/api/entity/body/item/BodyItem;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$y, reason: case insensitive filesystem */
    public static final class C47797y<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<String> f431540b;

        public C47797y(List<String> list) {
            this.f431540b = list;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((MessengerApi) obj).getBodyItems(this.f431540b);
        }
    }

    /* compiled from: MessengerClientImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi;", "api", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/Channel;", "apply", "(Lru/avito/messenger/MessengerApi;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.messenger.internal.d$z, reason: case insensitive filesystem */
    public static final class C47798z<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<io.reactivex.rxjava3.core.I<Channel>> f431541b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C47773d f431542c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f431543d;

        /* JADX WARN: Multi-variable type inference failed */
        public C47798z(Y41.a<? extends io.reactivex.rxjava3.core.I<Channel>> aVar, C47773d c47773d, String str) {
            this.f431541b = aVar;
            this.f431542c = c47773d;
            this.f431543d = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            MessengerApi messengerApi = (MessengerApi) obj;
            Y41.a<io.reactivex.rxjava3.core.I<Channel>> aVar = this.f431541b;
            if (aVar != null) {
                return aVar.invoke();
            }
            return this.f431542c.F(messengerApi.getChatById(this.f431543d), "avito.getChatById.v3");
        }
    }

    public C47773d(@Y61.k h31.e<InterfaceC47751d> eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.remote.analytics.messenger.j jVar, boolean z12, boolean z13) {
        this.f431388a = eVar;
        this.f431389b = interfaceC35745a5;
        this.f431390c = jVar;
        this.f431391d = z12;
        this.f431392e = z13;
        new W4("MessengerClient");
    }

    @Override // ru.avito.messenger.V
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Boolean> A() {
        I0 i0J0 = this.f431388a.get().M0().j0(this.f431389b.c());
        l41.r rVar = C47777e.f431448b;
        Objects.requireNonNull(rVar, "predicate is null");
        return new C41979p1(i0J0, rVar).D(C47778f.f431454b).k0(InterfaceC47751d.b.a.class).d0(C47779g.f431461b);
    }

    @Override // ru.avito.messenger.InterfaceC47841y
    @Y61.k
    public final io.reactivex.rxjava3.core.I<FoldersCountersResponse> B(@Y61.k Map<String, ? extends Collection<String>> map, @Y61.l Boolean bool) {
        return F(G().n(new D(map, bool)), "messenger.getUnreadCount.v2");
    }

    @Override // ru.avito.messenger.W
    @Y61.k
    public final <T> io.reactivex.rxjava3.core.z<T> C(@Y61.k Class<T> cls) {
        return this.f431388a.get().c().k0(InterfaceC42546d.class).u(y.f431807b).k0(InterfaceC42546d.class).d0(new D.a(new kotlin.jvm.internal.h0() { // from class: ru.avito.messenger.internal.d.U
            @Override // kotlin.jvm.internal.h0, kotlin.reflect.p
            @Y61.l
            public final Object get(@Y61.l Object obj) {
                return ((InterfaceC42546d) obj).getValue();
            }
        })).k0(cls);
    }

    @Override // ru.avito.messenger.InterfaceC47736e0
    @Y61.k
    public final io.reactivex.rxjava3.core.z<ChatMessage> D() {
        return C(ChatMessage.class);
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Map<String, VoiceInfo>> E(@Y61.k List<String> list) {
        return F(G().n(new P(list)), "messenger.getVoiceInfo");
    }

    public final <T> io.reactivex.rxjava3.core.I<T> F(io.reactivex.rxjava3.core.I<T> i12, String str) {
        return this.f431391d ? i12.t(new p0(str)) : i12;
    }

    public final io.reactivex.rxjava3.core.I<MessengerApi> G() {
        return this.f431388a.get().b();
    }

    public final io.reactivex.rxjava3.core.I<MessengerApi> H(MessengerUserHashInfo messengerUserHashInfo) {
        return this.f431392e ? this.f431388a.get().a().n(new r0(messengerUserHashInfo)) : G();
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I a(@Y61.k String str) {
        return F(G().n(new C47821e(str)), "messenger.quickReplyAdd.v1");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<G0> abortChunkedUpload(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        return F(G().n(new C47775b(str, str2, str3)), "messenger.abortChunkedUpload.v1");
    }

    @Override // ru.avito.messenger.V
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> b() {
        return A().N(Z.f431430b).d0(a0.f431431b);
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k ArrayList arrayList) {
        return F(G().n(new C47822f(str, str2, str3, arrayList)), "messenger.confirmChunkedUpload.v1");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<RawJson> callMethod(@Y61.k String str, @Y61.k RawJson rawJson) {
        return F(G().n(new C47780h(str, rawJson)), str);
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<G0> confirmChatAsNonSpam(@Y61.k String str, @Y61.k String str2) {
        return F(G().n(new C47783k(str, str2)), "messenger.suspectCancel");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<G0> confirmChatAsSpam(@Y61.k String str, @Y61.k String str2) {
        return F(G().n(new C47784l(str, str2)), "messenger.suspectConfirm");
    }

    @Override // ru.avito.messenger.V
    @Y61.k
    public final AbstractC41768a connect() {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new com.avito.android.serp.adapter.U(this, 7)).g(new io.reactivex.rxjava3.internal.operators.completable.v(this.f431388a.get().b()));
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<CreateFileResponse> createFile(@Y61.k String str) {
        return F(G().n(new C47788p(str)), "messenger.createFile.v1");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<CreateVoiceFileResponse> createVoiceFile(@Y61.k String str, long j12) {
        return F(G().n(new C47789q(str, j12)), "messenger.createVoiceFile");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I d(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
        return F(G().n(new C47823g(str, str2, str3)), "messenger.createChunkedVideo.v1");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> deleteMessage(@Y61.k String str, @Y61.k String str2) {
        return F(G().n(new C47790r(str, str2)), "messenger.deleteMessage.v2");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<G0> deleteQuickReply(@Y61.k String str) {
        return F(G().n(new C47791s(str)), "messenger.quickReplyDelete.v1");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I e(double d12, double d13) {
        return F(G().n(new n(d12, d13)), "messenger.reverseGeo.v1");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I f(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return F(H(messengerUserHashInfo).n(new C47786n(str)), "messenger.chatCreateByUserId.v2");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I g(@Y61.k Collection collection, @Y61.k List list, @Y61.k List list2) {
        return F(G().n(new ru.avito.messenger.internal.C(collection, list, list2)), "messenger.updateFolderTags.v1");
    }

    @Override // ru.avito.messenger.InterfaceC47840x
    @Y61.k
    public final io.reactivex.rxjava3.core.I<List<BlockedUser>> getBlacklist(int i12, @Y61.l Integer num) {
        return F(G().n(new C47792t(i12, num)).r(new D.a(new kotlin.jvm.internal.h0() { // from class: ru.avito.messenger.internal.d.u
            @Override // kotlin.jvm.internal.h0, kotlin.reflect.p
            @Y61.l
            public final Object get(@Y61.l Object obj) {
                return ((BlockedUsersResponse) obj).getUsers();
            }
        })), "avito.getBlacklist.v2");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<BlacklistReasons> getBlacklistReasons() {
        return F(G().n(C47794v.f431537b), "messenger.getBlacklistReasons");
    }

    @Override // ru.avito.messenger.Z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Map<String, Image>> getBodyImages(@Y61.k Collection<String> collection) {
        return F(G().n(new C47795w(collection)).r(C47796x.f431539b), "avito.getBodyImages");
    }

    @Override // ru.avito.messenger.Z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<List<BodyItem>> getBodyItems(@Y61.k List<String> list) {
        return F(G().n(new C47797y(list)), "avito.getBodyItems.v3");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChannelsCounters> getChatCounters() {
        return F(G().n(B.f431398b), "messenger.getUnreadCount.v1");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<GetFileResponse> getFile(@Y61.k String str) {
        return F(G().n(new C(str)), "messenger.getFile.v1");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<GeoSearchSuggests> getGeoSearchSuggests(@Y61.k String str, @Y61.k String str2, @Y61.l GeoPoint geoPoint) {
        return F(G().n(new F(str, str2, geoPoint)), "messenger.geoSearch.v1");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<C50261a> getPhoneByChannelId(@Y61.k String str, @Y61.l String str2) {
        return F(G().n(new G(str, str2)), "messenger.getPhoneByChannelId.v1");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<QuickRepliesResponse> getQuickReplies() {
        return F(G().n(H.f431408b), "messenger.quickReplies.v1");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<RecommendationsResponse> getRecommendations(@Y61.k String str, @Y61.k RawJson rawJson) {
        return F(G().n(new I(str, rawJson)), str);
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<MessageSuggestsResponse> getSellerSuggests(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        return F(G().n(new J(str, str2, str3)), "suggest.getMessages");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Map<String, String>> getUnknownMessageBodies(@Y61.k List<String> list) {
        return F(G().n(new K(list)), "avito.getMessageBodyUnknown");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<VideosResponse> getVideos(@Y61.k List<String> list) {
        return F(G().n(new N(list)), "messenger.getVideos.v1");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Map<String, GetFileResponse>> getVoiceFile(@Y61.k List<String> list) {
        return F(G().n(new O(list)), "messenger.getVoiceFile");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I h(int i12, @Y61.k String str) {
        return F(G().n(new z(i12, str)), "messenger.search.v2");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I i(@Y61.k String str, @Y61.l GeoPoint geoPoint) {
        return F(G().n(new m(str, geoPoint)), "messenger.favoritePlaces.v1");
    }

    @Override // ru.avito.messenger.InterfaceC47841y
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Channel> j(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.l Y41.a<? extends io.reactivex.rxjava3.core.I<Channel>> aVar) {
        return H(messengerUserHashInfo).n(new C47798z(aVar, this, str));
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Channel> k(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        return F(H(messengerUserHashInfo).n(new C47787o(str, str2, str3)), "messenger.chatCreateByAvito.v3");
    }

    @Override // ru.avito.messenger.InterfaceC47831n
    @Y61.k
    public final io.reactivex.rxjava3.core.I l(@Y61.l Integer num, @Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        return F(G().n(new o(str, str2, num, str3)).r(p.f431763b), "avito.getItemsForAttach.v3");
    }

    @Override // ru.avito.messenger.InterfaceC47738f0
    @Y61.k
    public final io.reactivex.rxjava3.core.I<GeoMarker[]> m(@Y61.k MarkersRequest markersRequest) {
        return F(G().n(new E(markersRequest)), markersRequest.getMethod());
    }

    @Override // ru.avito.messenger.Z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<G0> markChannelsAsUnread(@Y61.k List<String> list) {
        return F(G().n(new S(list)).r(T.f431424b), "messenger.unreadChats.v1");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I n(@Y61.k GetSettingsRequest.ForAutoReplies forAutoReplies) {
        return F(G().n(new r(forAutoReplies)), "messenger.getSettings.v2");
    }

    @Override // ru.avito.messenger.InterfaceC47841y
    @Y61.k
    public final io.reactivex.rxjava3.core.I<kotlin.Q<ChannelsResponse, Long>> o(@Y61.l MessengerUserHashInfo messengerUserHashInfo, @Y61.l Long l12, int i12, @Y61.k GetChannelFilters getChannelFilters, @Y61.l Y41.a<? extends io.reactivex.rxjava3.core.I<kotlin.Q<ChannelsResponse, Long>>> aVar) {
        return H(messengerUserHashInfo).n(new A(getChannelFilters, this, aVar, l12, i12));
    }

    @Override // ru.avito.messenger.InterfaceC47840x
    @Y61.k
    public final io.reactivex.rxjava3.core.I<G0> p(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l Long l12, @Y61.l String str4) {
        return F(G().n(new C47776c(str, str2, str3, l12, str4)).r(C12407d.f431442b), "avito.blacklistAdd.v2");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<PinUnpinChannelResponse> pinChannel(@Y61.k String str) {
        return F(G().n(new Y(str)), "messenger.pinChannel");
    }

    @Override // ru.avito.messenger.I0
    @Y61.k
    public final io.reactivex.rxjava3.core.z<X81.x> q() {
        return this.f431388a.get().c().k0(AbstractC42547e.v.class).d0(X.f431428b);
    }

    @Override // ru.avito.messenger.q0
    @Y61.k
    public final io.reactivex.rxjava3.core.I r(@Y61.k String str, @Y61.k List list, @Y61.l Y41.a aVar) {
        return G().n(new t(aVar, this, str, list));
    }

    @Override // ru.avito.messenger.InterfaceC47840x
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Boolean> s(@Y61.k String str) {
        return F(G().n(new b0(str)).r(new D.a(new kotlin.jvm.internal.h0() { // from class: ru.avito.messenger.internal.d.c0
            @Override // kotlin.jvm.internal.h0, kotlin.reflect.p
            @Y61.l
            public final Object get(@Y61.l Object obj) {
                return Boolean.valueOf(((SuccessResponse) obj).getSuccess());
            }
        })), "avito.blacklistRemove.v2");
    }

    @Override // ru.avito.messenger.InterfaceC47742h0
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> sendFileMessage(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Integer num) {
        return F(G().n(new d0(str, str2, str3, str4, num)), "messenger.sendFile.v2");
    }

    @Override // ru.avito.messenger.InterfaceC47742h0
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> sendImageMessage(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l Integer num) {
        return F(G().n(new e0(str, str2, str3, str4, num)), "avito.sendImageMessage.v2");
    }

    @Override // ru.avito.messenger.InterfaceC47742h0
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> sendItemMessage(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l Integer num, @Y61.l String str5) {
        return F(G().n(new f0(str, str2, str3, num, str4, str5)), "avito.sendItemMessage.v2");
    }

    @Override // ru.avito.messenger.InterfaceC47742h0
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> sendLinkMessage(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l Integer num) {
        return F(G().n(new g0(str, str3, str2, str4, num)), "messenger.sendLinkMessage.v2");
    }

    @Override // ru.avito.messenger.InterfaceC47742h0
    @Y61.k
    public final io.reactivex.rxjava3.core.I sendLocationMessage(@Y61.k String str, double d12, double d13, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Integer num) {
        return F(G().n(new h0(str, d12, d13, str3, str4, str2, str5, num)), "messenger.sendLocationMessage.v2");
    }

    @Override // ru.avito.messenger.InterfaceC47742h0
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> sendReactionMessage(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4) {
        return F(G().n(new i0(str, str2, str3, str4)), "messenger.sendReactionMessage.v2");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<G0> sendTyping(@Y61.k String str, @Y61.k List<String> list, @Y61.l Long l12) {
        return F(G().n(new k0(l12, list, str)), "messenger.sendTyping.v2");
    }

    @Override // ru.avito.messenger.InterfaceC47742h0
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> sendVideoMessage(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Integer num) {
        return F(G().n(new l0(str, str2, str3, num, str4, str5)), "messenger.sendVideo.v2");
    }

    @Override // ru.avito.messenger.InterfaceC47742h0
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> sendVoiceMessage(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Integer num) {
        return F(G().n(new m0(str, str2, str3, num, str4, str5)), "messenger.sendVoice");
    }

    @Override // ru.avito.messenger.V
    @Y61.k
    public final io.reactivex.rxjava3.core.z<ru.avito.messenger.k0> state() {
        return this.f431388a.get().M0().d0(n0.f431519b).D(o0.f431523b);
    }

    @Override // ru.avito.messenger.Z
    @Y61.k
    public final io.reactivex.rxjava3.core.I t(@Y61.l Y41.a aVar, @Y61.k List list) {
        return F(G().n(new Q(aVar, list)).r(R.f431422b), "messenger.readChats.v1");
    }

    @Override // ru.avito.messenger.q0
    @Y61.k
    public final io.reactivex.rxjava3.core.I<List<UserLastActivity>> u(@Y61.k List<String> list) {
        return F(G().n(new L(list)).r(M.f431416b), "messenger.getLastActionTimes.v2");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<PinUnpinChannelResponse> unpinChannel(@Y61.k String str) {
        return F(G().n(new q0(str)), "messenger.unpinChannel");
    }

    @Override // ru.avito.messenger.Z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<String> v(@Y61.k String str) {
        return F(G().n(new C47781i(str)).r(new C47782j(str)), "messenger.clearMessageHistoryMulti");
    }

    @Override // ru.avito.messenger.InterfaceC47842z
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Channel> w(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Y41.a<? extends io.reactivex.rxjava3.core.I<Channel>> aVar) {
        return H(messengerUserHashInfo).n(new C47785m(aVar, this, str, str2, str3, str4));
    }

    @Override // ru.avito.messenger.Z
    @Y61.k
    public final io.reactivex.rxjava3.core.I x(@Y61.k String str, @Y61.l Long l12, @Y61.l Integer num, @Y61.l Y41.a aVar) {
        return G().n(new x(aVar, l12, this, str, num));
    }

    @Override // ru.avito.messenger.InterfaceC47742h0
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> y(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l List<String> list, @Y61.l String str4, @Y61.l Integer num, @Y61.l String str5, @Y61.l Long l12, @Y61.l Y41.a<? extends io.reactivex.rxjava3.core.I<ChatMessage>> aVar) {
        return G().n(new j0(aVar, this, str, str2, str3, list, str4, num, str5, l12));
    }

    @Override // ru.avito.messenger.W
    @Y61.k
    public final <EventT extends InterfaceC44149a> io.reactivex.rxjava3.core.z<EventT> z(@Y61.k Class<EventT> cls, @Y61.k mx0.e eVar) {
        return this.f431388a.get().c().k0(InterfaceC42546d.class).u(y.f431807b).k0(AbstractC42547e.s.class).N(new V(eVar)).d0(W.f431427b).k0(cls);
    }
}
