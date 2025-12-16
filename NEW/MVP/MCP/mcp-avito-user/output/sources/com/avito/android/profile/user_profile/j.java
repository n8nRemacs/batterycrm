package com.avito.android.profile.user_profile;

import android.net.Uri;
import com.avito.android.remote.model.Avatar;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C43152f0;

/* compiled from: UserProfileInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/j;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface j {

    /* compiled from: UserProfileInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.l
    Object b(@Y61.k Continuation<? super Avatar> continuation);

    @Y61.l
    Object c(@Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object d(@Y61.k Uri uri, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object e(@Y61.k String str, @Y61.k String str2, @Y61.k Continuation<? super G0> continuation);

    @Y61.l
    Object f(@Y61.k Continuation continuation);

    @Y61.k
    C43152f0 o(boolean z12);
}
