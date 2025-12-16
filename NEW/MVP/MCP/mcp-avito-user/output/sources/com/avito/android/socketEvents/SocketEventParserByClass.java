package com.avito.android.socketEvents;

import Y61.k;
import com.google.gson.g;
import com.google.gson.i;
import java.lang.reflect.Type;
import kotlin.Metadata;
import mx0.InterfaceC44149a;

/* compiled from: SocketEventParserByClass.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/socketEvents/SocketEventParserByClass;", "Lcom/avito/android/socketEvents/SocketEventParser;", "_avito_socket-events_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SocketEventParserByClass implements SocketEventParser {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Class<? extends InterfaceC44149a> f284732a;

    public SocketEventParserByClass(@k Class<? extends InterfaceC44149a> cls) {
        this.f284732a = cls;
    }

    @Override // com.google.gson.h
    public final InterfaceC44149a deserialize(i iVar, Type type, g gVar) {
        return (InterfaceC44149a) gVar.b(iVar, this.f284732a);
    }
}
