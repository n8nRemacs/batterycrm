package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.InterfaceC38705bf;
import j.N;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes7.dex */
public class UserProfile {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final List<UserProfileUpdate<? extends InterfaceC38705bf>> f382494a;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedList<UserProfileUpdate<? extends InterfaceC38705bf>> f382495a = new LinkedList<>();

        public Builder apply(@N UserProfileUpdate<? extends InterfaceC38705bf> userProfileUpdate) {
            this.f382495a.add(userProfileUpdate);
            return this;
        }

        @N
        public UserProfile build() {
            return new UserProfile(this.f382495a, null);
        }
    }

    public UserProfile() {
        throw null;
    }

    public UserProfile(List list, a aVar) {
        this.f382494a = A2.c(list);
    }

    @N
    public static Builder newBuilder() {
        return new Builder();
    }

    @N
    public List<UserProfileUpdate<? extends InterfaceC38705bf>> getUserProfileUpdates() {
        return this.f382494a;
    }
}
