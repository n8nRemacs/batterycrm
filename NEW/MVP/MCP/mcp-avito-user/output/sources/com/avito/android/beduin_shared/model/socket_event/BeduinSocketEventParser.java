package com.avito.android.beduin_shared.model.socket_event;

import com.avito.android.socketEvents.SocketEventParser;
import com.avito.android.util.V2;
import com.google.gson.g;
import com.google.gson.i;
import java.lang.reflect.Type;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import mx0.InterfaceC44149a;
import rj.C47666c;
import vj.C49337a;

/* compiled from: BeduinSocketEventParser.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin_shared/model/socket_event/BeduinSocketEventParser;", "Lcom/avito/android/socketEvents/SocketEventParser;", "<init>", "()V", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinSocketEventParser implements SocketEventParser {
    @Inject
    public BeduinSocketEventParser() {
    }

    @Override // com.google.gson.h
    public final InterfaceC44149a deserialize(i iVar, Type type, g gVar) {
        Map mapC;
        try {
            mapC = (Map) gVar.b(iVar, new C47666c().getType());
        } catch (Exception e12) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to parse BeduinSocketEvent params: ", e12);
            mapC = P0.c();
        }
        if (mapC == null) {
            mapC = P0.c();
        }
        return new C49337a(mapC);
    }
}
