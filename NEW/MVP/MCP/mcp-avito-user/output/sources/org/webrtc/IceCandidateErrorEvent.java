package org.webrtc;

/* loaded from: classes9.dex */
public final class IceCandidateErrorEvent {
    public final String address;
    public final int errorCode;
    public final String errorText;
    public final int port;
    public final String url;

    @CalledByNative
    public IceCandidateErrorEvent(String str, int i12, String str2, int i13, String str3) {
        this.address = str;
        this.port = i12;
        this.url = str2;
        this.errorCode = i13;
        this.errorText = str3;
    }
}
