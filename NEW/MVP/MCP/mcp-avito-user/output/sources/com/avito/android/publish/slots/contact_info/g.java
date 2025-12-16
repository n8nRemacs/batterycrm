package com.avito.android.publish.slots.contact_info;

import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.model.Session;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.EmailParameter;
import com.avito.android.remote.model.category_parameters.PhoneParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.contact_info.ContactInfoSlot;
import com.avito.android.remote.model.category_parameters.slot.contact_info.ContactInfoSlotConfig;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: ContactInfoSlotWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/Session;", "session", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/G0;", "apply", "(Lcom/avito/android/remote/model/Session;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f243256b;

    public g(d dVar) {
        this.f243256b = dVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        T next;
        T next2;
        String string;
        T next3;
        d dVar = this.f243256b;
        InterfaceC34401z0 interfaceC34401z0 = dVar.f243227e;
        String accessToken = ((Session) obj).getAccessToken();
        ContactInfoSlot contactInfoSlot = dVar.f243224b;
        Iterator<T> it = contactInfoSlot.getParameters().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = (T) null;
                break;
            }
            next = it.next();
            if (next instanceof EmailParameter) {
                break;
            }
        }
        if (!(next instanceof EmailParameter)) {
            next = null;
        }
        EmailParameter emailParameter = next;
        String value = emailParameter != null ? emailParameter.getValue() : null;
        if (value == null) {
            value = "";
        }
        Iterator<T> it2 = contactInfoSlot.getParameters().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = (T) null;
                break;
            }
            next2 = it2.next();
            if (next2 instanceof PhoneParameter) {
                break;
            }
        }
        if (!(next2 instanceof PhoneParameter)) {
            next2 = null;
        }
        PhoneParameter phoneParameter = next2;
        String value2 = phoneParameter != null ? phoneParameter.getValue() : null;
        if (value2 != null) {
            StringBuilder sb2 = new StringBuilder();
            int length = value2.length();
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = value2.charAt(i12);
                if (cCharAt == '+' || Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            string = sb2.toString();
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        Iterator<T> it3 = contactInfoSlot.getParameters().iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = (T) null;
                break;
            }
            next3 = it3.next();
            String id2 = ((ParameterSlot) next3).getId();
            CharParameter nameField = ((ContactInfoSlotConfig) contactInfoSlot.getWidget().getConfig()).getNameField();
            if (L.f(id2, nameField != null ? nameField.getId() : null)) {
                break;
            }
        }
        CharParameter charParameter = next3 instanceof CharParameter ? next3 : null;
        String value3 = charParameter != null ? charParameter.getValue() : null;
        if (value3 == null) {
            value3 = "";
        }
        return interfaceC34401z0.D(accessToken, value, string, value3, Boolean.TRUE, null, null, null).T(new e(dVar), Integer.MAX_VALUE).j0(dVar.f243231i.e()).d0(new f(dVar));
    }
}
