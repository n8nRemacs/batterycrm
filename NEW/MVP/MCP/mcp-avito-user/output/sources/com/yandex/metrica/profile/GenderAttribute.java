package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.Dn;
import com.yandex.metrica.impl.ob.InterfaceC38705bf;
import com.yandex.metrica.impl.ob.Me;
import com.yandex.metrica.impl.ob.Pe;
import com.yandex.metrica.impl.ob.Ve;
import com.yandex.metrica.impl.ob.We;
import com.yandex.metrica.impl.ob.Xe;
import com.yandex.metrica.impl.ob.Ye;
import com.yandex.metrica.impl.ob.Ym;
import j.N;

/* loaded from: classes7.dex */
public class GenderAttribute {

    /* renamed from: a, reason: collision with root package name */
    public final Pe f382490a = new Pe("appmetrica_gender", new Dn(), new Xe());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");

        private final String mStringValue;

        Gender(String str) {
            this.mStringValue = str;
        }

        public String getStringValue() {
            return this.mStringValue;
        }
    }

    @N
    public UserProfileUpdate<? extends InterfaceC38705bf> withValue(@N Gender gender) {
        Pe pe2 = this.f382490a;
        return new UserProfileUpdate<>(new Ye(pe2.a(), gender.getStringValue(), new Ym(), pe2.b(), new Me(pe2.c())));
    }

    @N
    public UserProfileUpdate<? extends InterfaceC38705bf> withValueIfUndefined(@N Gender gender) {
        Pe pe2 = this.f382490a;
        return new UserProfileUpdate<>(new Ye(pe2.a(), gender.getStringValue(), new Ym(), pe2.b(), new We(pe2.c())));
    }

    @N
    public UserProfileUpdate<? extends InterfaceC38705bf> withValueReset() {
        Pe pe2 = this.f382490a;
        return new UserProfileUpdate<>(new Ve(0, pe2.a(), pe2.b(), pe2.c()));
    }
}
