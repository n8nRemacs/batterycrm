package com.google.firebase.heartbeatinfo;

import j.N;

/* loaded from: classes6.dex */
public interface HeartBeatInfo {

    public enum HeartBeat {
        NONE(0),
        /* JADX INFO: Fake field, exist only in values array */
        SDK(1),
        GLOBAL(2),
        /* JADX INFO: Fake field, exist only in values array */
        COMBINED(3);


        /* renamed from: b, reason: collision with root package name */
        public final int f361610b;

        HeartBeat(int i12) {
            this.f361610b = i12;
        }
    }

    @N
    HeartBeat a();
}
