package com.avito.android.social_management.adapter.notification;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.social_management.adapter.SocialItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SocialNotificationAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/social_management/adapter/notification/j;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/social_management/adapter/notification/j$a;", "Lcom/avito/android/social_management/adapter/notification/j$b;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class j {

    /* compiled from: SocialNotificationAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social_management/adapter/notification/j$a;", "Lcom/avito/android/social_management/adapter/notification/j;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SocialItem.Notification f284548a;

        public a(@k SocialItem.Notification notification) {
            super(null);
            this.f284548a = notification;
        }
    }

    /* compiled from: SocialNotificationAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social_management/adapter/notification/j$b;", "Lcom/avito/android/social_management/adapter/notification/j;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends j {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SocialItem.Notification f284549a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f284550b;

        public b(@k SocialItem.Notification notification, @k DeepLink deepLink) {
            super(null);
            this.f284549a = notification;
            this.f284550b = deepLink;
        }
    }

    public /* synthetic */ j(C42822w c42822w) {
        this();
    }

    public j() {
    }
}
